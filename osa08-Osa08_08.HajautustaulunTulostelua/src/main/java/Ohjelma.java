
import java.util.HashMap;

public class Ohjelma {

    public static void main(String[] args) {
        HashMap<String, String> taulu = new HashMap<>();
        taulu.put("esim.", "esimerkiksi");
        taulu.put("jne.", "ja niin edelleen");
        taulu.put("yms.", "ynnä muuta sellaista");

        tulostaAvaimet(taulu);
                System.out.println("---");
tulostaAvaimetJoissa(taulu, "m");
System.out.println("---");
tulostaArvotJosAvaimessa(taulu, "ne");
        
        
    }
    
    public static void tulostaAvaimet(HashMap<String, String> hajautustaulu) {
        
        for (String avaimet : hajautustaulu.keySet()) {
            System.out.println(avaimet);
        }
    }
    
    public static void tulostaAvaimetJoissa(HashMap<String, String> hajautustaulu, String merkkijono) {
        
        for (String avaimetJoissa : hajautustaulu.keySet()) {
            if (!avaimetJoissa.contains(merkkijono)) {
                continue;
            }
            
            System.out.println(avaimetJoissa);
        }
    }
    
    public static void tulostaArvotJosAvaimessa(HashMap<String, String> hajautustaulu, String merkkijono) {
        
        for (String arvot : hajautustaulu.keySet()) {
            if (arvot.contains(merkkijono)) {
                System.out.println(hajautustaulu.get(arvot));
            }
            
        } 
    }
    
    

}
