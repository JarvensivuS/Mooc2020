/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samul
 */
public class Sailio {
    private int sisalto;
    
    
    public Sailio() {
        this.sisalto = 0;
    }
    
    public int sisalto() {
        return this.sisalto;
    }
    
    public void lisaa(int maara) {
        if (maara > 0) {
            sisalto += maara;
            if (sisalto > 100) {
                sisalto = 100;
            }
        }
    }
    
    public void poista(int maara) {
        if (maara > 0) {
            sisalto -= maara;
            
            if (sisalto < 0) {
                sisalto = 0;
            }
        }
    }
    
    public String toString() {
        
        return sisalto + "/100";
    }
}
