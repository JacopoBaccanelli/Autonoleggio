public class App {
    public static void main(String[] args) throws Exception {
        Auto auto1 = new Auto(14561, "GA 258 PO", "Lamborghini", "Urus", 5);
        System.out.println(auto1);

        Patente patente1 = new Patente("Fabio", "Vidilini", "16/05/2002", "stessa dello yogurt");
        System.out.println(patente1);
    }
}