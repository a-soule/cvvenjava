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
@Table(name = "evenement")
public class Evenement {
    //Numéro de participant
    @Id
    @GeneratedValue
    @Column(name = "num_even")
    private int num_even;
    
    @Column(name = "intitule")
    private String intitule;
    
    @Column(name = "date_debut")
    private String date_debut;
    
    @Column(name = "theme")
    private String theme;
    
    @Column(name = "duree")
    private String duree;
    
    @Column(name = "nb_part_max")
    private String nb_part_max;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "organisateur")
    private String organisateur;
    
    @Column(name = "type_even")
    private String type_even;
    
    @Column(name = "refSalle")
    private int refSalle;

    
    public Evenement(){
    }
    
    public Evenement(String intitule, String date_debut, String theme, String duree, String nb_part_max, String description, String organisateur, String type_even, int refSalle) {
        this.intitule = intitule;
        this.date_debut = date_debut;
        this.theme = theme;
        this.duree = duree;
        this.nb_part_max = nb_part_max;
        this.description = description;
        this.organisateur = organisateur;
        this.type_even = type_even;
        this.refSalle = refSalle;
    }

    public int getNum_even() {
        return num_even;
    }

    public String getIntitule() {
        return intitule;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public String getTheme() {
        return theme;
    }

    public String getDuree() {
        return duree;
    }

    public String getNb_part_max() {
        return nb_part_max;
    }

    public String getDescription() {
        return description;
    }

    public String getOrganisateur() {
        return organisateur;
    }

    public String getType_even() {
        return type_even;
    }

    public int getRefSalle() {
        return refSalle;
    }
    
    public void setRefSalle(int refSalle) {
        this.refSalle = refSalle;
    }

 
    
    

    @Override
    public String toString() {
        return this.intitule;
    }
    
    
    

}
