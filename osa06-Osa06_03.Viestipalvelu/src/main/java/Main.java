
public class Main {

    public static void main(String[] args) {

        Viesti viesti = new Viesti("Samuli", "waaa");
        
        System.out.println(viesti.getLahettaja());
        System.out.println(viesti.getSisalto());
    }
}
