/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatecvven.metier;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe Participant
 *
 * @author Clément BOIN
 */
@Entity
@Table(name = "participant")

public class Participant implements Serializable{

    //Numéro de participant
    @Id
    @GeneratedValue
    @Column(name = "num_pers")
    private int num_pers;

    // Nom du participant
    @Column(name = "nom")
    private String nom;

    // Prénom du participant
    @Column(name = "prenom")
    private String prenom;


    @Column(name = "organisation")
    private String organisation;
    

    @Column(name = "email")
    private String email;
    
    @Column(name = "date_naiss")
    private Date date;
    
    @Column(name = "observations")
    private String observations;
    

    public Participant() {
    }

    public Participant(String nom, String prenom, String organisation, String email,Date date, String observations) {
        this.nom = nom;
        this.prenom = prenom;
        this.organisation = organisation;
        this.email = email;
        this.date = date;
        this.observations = observations;
    }

    

    public int getNum_pers() {
        return num_pers;
    }

    public void setNum_pers(int num_pers) {
        this.num_pers = num_pers;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
    
    public String toString(){
        return this.nom +" "+this.prenom;
    }

    
    
    


}