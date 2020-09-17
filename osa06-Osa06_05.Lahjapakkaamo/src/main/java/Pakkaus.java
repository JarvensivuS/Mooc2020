
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samul
 */
public class Pakkaus {
    private ArrayList<Lahja> sisalto;
    
    public Pakkaus() {
        this.sisalto = new ArrayList<>();
    }
    
    public void lisaaLahja(Lahja lahja) {
        sisalto.add(lahja);
    }
    
    public int yhteispaino() {
        int yhteensa = 0;
                
                for (Lahja punnittava : sisalto ) {
                    yhteensa = yhteensa + punnittava.getPaino();
                }
                return yhteensa;
    }
}
