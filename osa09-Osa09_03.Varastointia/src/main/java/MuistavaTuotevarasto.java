/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samul
 */
public class MuistavaTuotevarasto extends Tuotevarasto{
    private Muutoshistoria muutos;
    
    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        this.muutos = new Muutoshistoria();
        super.lisaaVarastoon(alkuSaldo);
        muutos.lisaa(alkuSaldo);
    }
    
    public String historia() {
        return this.muutos.toString();
    }
    
    public void lisaaVarastoon(double maara) {
        super.lisaaVarastoon(maara);
        this.muutos.lisaa(super.getSaldo());
    }
    
    public double otaVarastosta(double maara) {
        double palauta = super.otaVarastosta(maara);
        this.muutos.lisaa(super.getSaldo());
        return palauta;
    }
    
    public void tulostaAnalyysi()  {
        System.out.println("Tuote:" + super.getNimi());
        System.out.println("Historia:" + this.historia());
        System.out.println("Suurin tuotemäärä:" + muutos.maxArvo());
        System.out.println("Pienin tuotemäärä:" + muutos.minArvo());
        System.out.println("Keskiarvo:" + muutos.keskiarvo());
    }
    
}
