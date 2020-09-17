import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Opiskelija op = new Opiskelija("Olli","Ida Albergintie 1"); 
        System.out.print(op);
        
        
    }
    
    public static void tulostaHenkilot(ArrayList<Henkilo> henkilot) {
        
        for (Object lista : henkilot) {
            System.out.println(lista);
        }
        
    }

}
