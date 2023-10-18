public class App {
    public static void main(String[] args) throws Exception {
        Auto auto1 = new Auto(14561, "GA 258 PO", "Lamborghini", "Urus", 5);
        System.out.println(auto1);

        Cliente cliente1 = new Cliente("Eros", "Chiapparini", 17);
        System.out.println(cliente1);

        Patente patente1 = new Patente("Jacopo", "Baccanelli", 17, "16/05/2002", "16/05/2022");
        System.out.println(patente1);
    }
}
