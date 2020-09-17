
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tehtavalista lista = new Tehtavalista();
        Käyttöliittymä gui = new Käyttöliittymä(lista, sc);
        
        gui.kaynnista();

    }
}
