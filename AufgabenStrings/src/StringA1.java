
public class StringA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vorname = "Daniel";
		String nachname = "Hentges";
		String name = vorname+" "+nachname;
		System.out.println(name);
		System.out.println("Die Länge des VN ist: "+vorname.length());
		System.out.println("Die Länge des NN ist: "+nachname.length());
		System.out.println("Die Länge des Namens ist: "+name.length());
		char kvn = vorname.charAt(0);
		char knn = nachname.charAt(0);
		String  kuerzel = vorname.charAt(0) + nachname.charAt(0);
		System.out.println("Die Initialien sind: "+ kuerzel);
		System.out.print(vorname.charAt(0));
		System.out.println(nachname.charAt(0));

}}
