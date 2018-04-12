/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aliments;

/**
 *
 * @author diginamic09
 */
public class Viande extends Aliment{
    private String nom;
    public Viande(String nom){
        super(nom);
    }
    public String getNom(){
        return this.nom;
    }
}
