
public class Application {

	public static void main(String[] args) {

		Address Autohersteller  = new Address("Autohersteller", "", "Autoplatz", 1, 11111, "Autostadt ");
		
		

		Autohersteller.printAddress();
		
		Address PeterMusterautohaus   = new Address("Peter  ", "Musterautohaus", "Marktplatz ", 2, 80888, "München");

		PeterMusterautohaus.printAddress();
		
		Address EvaMusterautohaus   = new Address("Eva ", "Musterautohaus", "Milchstraße ", 14, 90234,"Galazien");

		EvaMusterautohaus .printAddress();
		
		Address LucaMusterautohaus   = new Address("Luca ", "Musterautohaus", "Spielstraße ", 15, 76543, "Bretterbach");

		LucaMusterautohaus.printAddress();
		
		MotorVehicle a = new MotorVehicle(300, 150, 150, 1300.0, "JEEP ", "Musterkunde", "Autohersteller", "Musterziel", false);
		a.printMotorVehicle();
		
		MotorVehicle b = new MotorVehicle(300, 150, 150, 1300.0, "SPORTSCAR ", "Musterkunde", "Musterstart", "Musterziel", false);
		b.printMotorVehicle();
		
		MotorVehicle c = new MotorVehicle(300, 150, 150, 1300.0, "", "Musterkunde", "Musterstart", "Musterziel", false);
		c.printMotorVehicle();


	}

	private static void getZieladresse() {
		// TODO Auto-generated method stub
		
	}

}
