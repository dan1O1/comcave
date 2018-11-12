
public class MotorVehicle {

//	private int groesse;
	private int laenge;
	private int hoehe;
	private int breite;
	private double gewicht;
	private String marke;
	private String kunde;
	private String startadresse;
	private String zieladresse;
	private Boolean lieferung;
//	private int groesse;

	public MotorVehicle() {
		this(1, 1, 1, 1.0, "Mustermarke", "Musterkunde", "Musterstart", "Musterziel", false);
	}

	public MotorVehicle(int laenge, int hoehe, int breite, double gewicht, String marke, String kunde,
			String startadresse, String zieladresse, Boolean lieferung) {
		super();
//		this.groesse = groesse;
		this.laenge = laenge;
		this.hoehe = hoehe;
		this.breite = breite;
		this.gewicht = gewicht;
		this.marke = marke;
		this.kunde = kunde;
		this.startadresse = startadresse;
		this.zieladresse = zieladresse;
		this.lieferung = lieferung;
	}
//
//	public int getGroesse() {
//		return groesse;
//	}
//
//	public void setGroesse(int groesse) {
//		this.groesse = groesse;
//	}

	public int getLaenge() {
		return laenge;
	}

	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}

	public int getHoehe() {
		return hoehe;
	}

	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}

	public int getBreite() {
		return breite;
	}

	public void setBreite(int breite) {
		this.breite = breite;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public String getKunde() {
		return kunde;
	}

	public void setKunde(String kunde) {
		this.kunde = kunde;
	}

	public String getStartadresse() {
		return startadresse;
	}

	public void setStartadresse(String startadresse) {
		this.startadresse = startadresse;
	}

	public String getZieladresse() {
		return zieladresse;
	}

	public void setZieladresse(String zieladresse) {
		this.zieladresse = zieladresse;
	}

	public Boolean getLieferung() {
		return lieferung;
	}

	public void setLieferung(Boolean lieferung) {
		this.lieferung = lieferung;
	}

//	public int groesse(int groesse) {
//
//		this.groesse = (this.laenge * this.hoehe * this.breite);
//		return groesse;
//	}

	public void lieferung() {

		if (this.lieferung == true) {
			System.out.println("Kein Selbstabholer");
		}
	}
	
	public void printMotorVehicle() {

		System.out.println("Größe des Fahrzeugs: " + (this.laenge * this.hoehe * this.breite));
		System.out.println("\n" + "Gewicht: " + this.gewicht);
		System.out.println("\n" + "Automarke: " + this.marke);
		System.out.println("\n" + "Absenderadresse: " + this.zieladresse);
		System.out.println("\n" + "Zieladresse: " + this.startadresse);
		System.out.println("\n-----------------------------------------");

	}
}
