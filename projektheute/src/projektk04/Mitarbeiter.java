package projektk04;

public class Mitarbeiter {

	private String nameMitarbeiter;

	private String anrede;

	private int position;

	private int telefon;
	
	public Mitarbeiter (String parameter1, String parameter2, int parameter3, int parameter4) {
		nameMitarbeiter = parameter1;
		anrede = parameter2;
		position = parameter3;
		telefon = parameter4;
	}

	public void loeschenMitarbeiter() {

	}

	public void setMitarbeiterName() {

	}

	//public void getMitarbeiterName() {
		
	String getMitarbeiterName() { //Abrufen der Mitarbeiternamen
			return nameMitarbeiter;
		}
	String getanrede() { 
		return anrede;
	}
	int position() {
		return position;
	}
	int telfon() {
		return telefon;
		
	}

	public void setServiceAuftrag() { //Array?

	}

	public void getServiceAuftrag() { //Array?

	}

}
