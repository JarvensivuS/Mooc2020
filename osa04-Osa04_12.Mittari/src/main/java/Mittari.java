/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samul
 */
public class Mittari {
    private int mitta;
    
    public void Mittari() {
        mitta = 0;
    }
    
    public void lisaa() {
        if (mitta < 5) {
            mitta++;
        } 
    }
    
    public void vahenna() {
        if (mitta < 0) {
            mitta--;
        }
    }
    
    public boolean taynna() {
        if (mitta == 5) {
            return true;
        } else {
            return false;
        }
    }
    
    public int mitta() {
        return mitta;
    }
    
    
}
