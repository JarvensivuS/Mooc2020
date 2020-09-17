/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samul
 */
public class Esine {
    private String tunnus;
    private String nimi;
    
    public Esine(String tunnus, String nimi) {
        this.tunnus = tunnus;
        this.nimi = nimi;
    }
    
    public String getTunnus() {
        return this.tunnus;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public String toString() {
        return this.tunnus + ": " + this.nimi;
    }
}
