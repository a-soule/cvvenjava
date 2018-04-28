
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatecvven.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author pc
 */

@Entity
@Table(name = "salle")
public class Salle {
    
    @Id
    @GeneratedValue
    @Column(name = "id_salle")
    private int id_salle;
    
    @Column(name = "nom")
    private String nom;

    public Salle(String nom) {
        this.nom = nom;
    }
    
    public Salle(){
        
    }

    public int getId_salle() {
        return id_salle;
    }

    public void setId_salle(int id_salle) {
        this.id_salle = id_salle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String toString(){
        return this.nom;
    }
    
    
    
    
    
}
