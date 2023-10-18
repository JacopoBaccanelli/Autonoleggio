public class Main {
	public static void main(String[] args) {
	    Treno treno1 = new Treno(150, 3);
		System.out.println(treno1);
		
		Orari orari1 = new Orari("Edolo-Brescia");
		System.out.println(orari1);
		
		Biglietti biglietti1 = new Biglietti("8,50€", "prima classe", "24 ore");
		System.out.println(biglietti1);
	}
}