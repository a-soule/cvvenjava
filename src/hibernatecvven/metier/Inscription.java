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
@Table(name = "inscription")
public class Inscription {
    
    @Id
    @GeneratedValue
    @Column(name = "num_inscr")
    private int num_inscr;
    
    @Column(name = "refParticipant")
    private int refParticipant;
    
    @Column(name = "refEvenement")
    private int refEvenement;

    public Inscription(int refParticipant, int refEvenement) {
        this.refParticipant = refParticipant;
        this.refEvenement = refEvenement;
    }
    
    public Inscription(){
        
    }

    public int getNum_inscr() {
        return num_inscr;
    }

    public int getRefParticipant() {
        return refParticipant;
    }

    public int getRefEvenement() {
        return refEvenement;
    }
    
    
    
}
