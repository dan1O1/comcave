
public class Address {

	private String vornamen;
	private String nachnamen;
	private String straßennamen;
	private int hausnummer;
	private int plz;
	private String ort;

	public Address() {

		this("Max", "", "Hauptstraße", 1, 12345, "Musterhausen");

	}

	public Address(String vornamen, String nachnamen, String straßennamen, int hausnummer, int plz, String ort) {

		this.setVornamen(vornamen);
		this.setNachnamen(nachnamen);
		this.setStraßennamen(straßennamen);
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
			System.out.println("Dies ist keine gültige PLZ");
		}
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getStraßennamen() {
		return straßennamen;
	}

	public void setStraßennamen(String straßennamen) {
		this.straßennamen = straßennamen;
	}

	public void printAddress() {

		System.out.println(this.vornamen + this.nachnamen);
		System.out.println("\n" + this.straßennamen + this.hausnummer);
		System.out.println("\n" + this.plz + this.ort);
		System.out.println("\n-----------------------------------------");

	}

}
