
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        
        for (int i=0; i<maara; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void tulostaTyhjaa(int maara) {

        for (int i=0; i<maara; i++){
            System.out.print(" ");
        }
    }

    public static void tulostaKolmio(int koko) {
        for (int i=1; i<=koko; i++){
            tulostaTyhjaa(koko-i);
            tulostaTahtia(i);
        }
    }

    public static void jouluKuusi(int korkeus) {
        
        int koko = (korkeus)-1;
        int tahtia = 1;
        
        for (int i=0; i < korkeus;i++){
            
            tulostaTyhjaa(koko);
            tulostaTahtia(tahtia);
            koko--;
            tahtia=tahtia+2;
        }
        
        for (int i=0; i < 2;i++){
            
            tulostaTyhjaa((korkeus)-2);
            tulostaTahtia(3);
        }
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(8);
        System.out.println("---");
        jouluKuusi(6);
        System.out.println("---");
        jouluKuusi(4);
    }
    

}
