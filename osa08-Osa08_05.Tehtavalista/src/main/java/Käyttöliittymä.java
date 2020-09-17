import java.util.*;


public class Käyttöliittymä {
    private Tehtavalista lista;
    private Scanner sc;
    
    
    public Käyttöliittymä(Tehtavalista lista, Scanner sc) {
        this.lista = lista;
        this.sc = sc;
        lista = new Tehtavalista();
        sc = new Scanner(System.in);
        
    }
    
    public void kaynnista() {
        
        while (true) {
            System.out.print("Komento: ");
            String lue = sc.nextLine();
            if (lue.equalsIgnoreCase("lopeta")) {
                break;
            } else if (lue.equalsIgnoreCase("lisaa")) {
                System.out.print("Lisättävä: ");
                String tehtava = sc.nextLine();
                lista.lisaa(tehtava);
            } else if (lue.equalsIgnoreCase("listaa")) {
                lista.tulosta();
            } else if (lue.equalsIgnoreCase("poista")) {
                System.out.print("Mikä poistetaan?");
                int luku = sc.nextInt();
                lista.poista(luku);
            }
            
            
        }
    }
}
