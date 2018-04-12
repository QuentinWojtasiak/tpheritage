/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpheritage;

import animal.Animal;

/**
 *
 * @author diginamic09
 */
public class Aliment {
    private String nom;
    private Animal animal;
    
    public Aliment(String nom){
        this.nom=nom;
        this.animal=null;
    }
    
    public Aliment(Animal animal){
        this.animal=animal;
        this.nom=animal.getNom();
    }
}
