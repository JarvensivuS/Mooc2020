public class Kirja {
    
    private String nimi;
    private int vuosi;
    
    public Kirja(String nimi, int vuosi) {
        this.nimi = nimi;
        this.vuosi = vuosi;
    }
    
    public String getNimi() {
        return nimi;
    }

    public int getVuosi() {
        return vuosi;
    } 
}