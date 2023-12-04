
public class Buch {
	String title;
	String autor;
	double preis;

	public Buch(String title, String autor, double preis) {
		super();
		this.title = title;
		this.autor = autor;
		this.preis = preis;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
}
