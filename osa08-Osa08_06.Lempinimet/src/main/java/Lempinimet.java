
import java.util.HashMap;

public class Lempinimet {

    public static void main(String[] args) {
        // Tee tehtävänannossa pyydetyt operaatiot täällä!
        
        HashMap<String,String> nimet = new HashMap<>();
        
        nimet.put("Matti", "mage");
        nimet.put("Mikael", "mixu");
        nimet.put("Arto", "Arppa");
        
        System.out.println(nimet.get("Matti"));
        System.out.println(nimet.get("Mikael"));
        System.out.println(nimet.get("Arto"));

    }

}
