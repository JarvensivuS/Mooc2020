
public class TaulukonTulostaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        // Kirjoita koodia tänne
        
        int index = 0;
        
        while (index < taulukko.length) {
            
            if (index == taulukko.length - 1) {
                System.out.print(taulukko[index]);
                break;
            } else {
               System.out.print(taulukko[index] + ", "); 
            }
            
            index++;
        }
    }
}
