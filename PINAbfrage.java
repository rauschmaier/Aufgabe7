import java.util.Scanner;

public class PINAbfrage {

	public static void main(String[] args) {
		try {
			pinEingeben();
			System.out.println("PIN korrekt");
		} 
		catch (PINFinallyWrongException e) {
			System.out.println("PIN 3 mal falsch eingegeben. Bitte PUK eingeben.");
		}
	}
	
	// drei Versuche anbieten
	private static void pinEingeben() throws PINFinallyWrongException {
		Scanner kb = new Scanner(System.in);
		for(int i = 1; i <= 3; i++) {
			System.out.println(i + ".Versuch. Bitte PIN eingeben");
			int eingabe = kb.nextInt();
			try {
				checkPIN(eingabe);
				return;
			}
			catch(PINWrongException e) {
				
				if(i == 3)
					throw new PINFinallyWrongException();
				else
					System.out.println(e.getErrorMessage());
			}
		}
	}
	
	// einzelne PIN-Eingabe (1 Versuch)
	private static void checkPIN(int eingabe) throws PINWrongException {
		int hinterlegtePIN = 2884;

		if(eingabe != hinterlegtePIN)
			throw new PINWrongException("PIN ist falsch. Bitte erneut versuchen.");
	}
}
