/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassName;

/**
 *
 * @author thoma
 */
public class Administrateur {
    private int ID;
    private String email;
    private String password;
    private String prenom;
    private String nom;

    public Administrateur(int ID, String email, String password, String prenom, String nom) {
        this.ID = ID;
        this.email = email;
        this.password = password;
        this.prenom = prenom;
        this.nom = nom;
    }
    public Administrateur(String email, String password, String prenom, String nom) {
        this.email = email;
        this.password = password;
        this.prenom = prenom;
        this.nom = nom;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

   
    
    
}
