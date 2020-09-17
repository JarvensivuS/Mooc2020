/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samul
 */
public class Opiskelija extends Henkilo{
    private int pisteet;
    
    public Opiskelija(String nimi, String osoite) {
        super(nimi, osoite);
    }
    
    public int opintopisteita() {
        
        return pisteet;
    }
    
    public void opiskele() {
        pisteet++;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  opintopisteitä " + opintopisteita();
    }
    
}
