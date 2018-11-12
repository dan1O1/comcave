
public class Address {

	private String vornamen;
	private String nachnamen;
	private String stra�ennamen;
	private int hausnummer;
	private int plz;
	private String ort;

	public Address() {

		this("Max", "", "Hauptstra�e", 1, 12345, "Musterhausen");

	}

	public Address(String vornamen, String nachnamen, String stra�ennamen, int hausnummer, int plz, String ort) {

		this.setVornamen(vornamen);
		this.setNachnamen(nachnamen);
		this.setStra�ennamen(stra�ennamen);
		this.setHausnummer(hausnummer);
		this.setPlz(hausnummer);
		this.setOrt(ort);

		// TODO Auto-generated constructor stub
	}

	public String getVornamen() {
		return vornamen;
	}

	public void setVornamen(String vornamen) {
		this.vornamen = vornamen;
	}

	public String getNachnamen() {
		return nachnamen;
	}

	public void setNachnamen(String nachnamen) {
		this.nachnamen = nachnamen;
	}

	public int getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
		if (plz > 99999) {
			System.out.println("Dies ist keine g�ltige PLZ");
		}
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getStra�ennamen() {
		return stra�ennamen;
	}

	public void setStra�ennamen(String stra�ennamen) {
		this.stra�ennamen = stra�ennamen;
	}

	public void printAddress() {

		System.out.println(this.vornamen + this.nachnamen);
		System.out.println("\n" + this.stra�ennamen + this.hausnummer);
		System.out.println("\n" + this.plz + this.ort);
		System.out.println("\n-----------------------------------------");

	}

}
