import java.util.ArrayList;

public class Bucverwaltung {
    private ArrayList<Buch> buchliste;

    public Bucverwaltung() {
        this.buchliste = new ArrayList<>();
    }

    public void buchHinzufuegen(Buch buch) throws UngueltigerPreisException {
        // Überprüfen Sie den Preis des Buches.
        if (buch.getPreis() <= 0) {
            throw new UngueltigerPreisException("Ungültiger Preis: Der Preis muss größer als 0 sein.");
        }

        // Fügen Sie das Buch zur Liste hinzu, wenn der Preis gültig ist.
        buchliste.add(buch);
        System.out.println("Buch erfolgreich hinzugefügt: " + buch.getTitle());
    }

    // Weitere Methoden zur Buchverwaltung können hier hinzugefügt werden.
}
