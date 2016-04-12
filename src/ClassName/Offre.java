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
public class Offre {
    private int idOffre;
    private String DescriptionPoste;
    private String Intitule;
    private String DateDebutPublication;
    private String DateFinPublication;
    private String NombrePoste;
    private String Localisation;
    private String OffreCastingcol;
    private String DescriptionProfileRecherche;
    private String Reference;
    private String Mail;
    private String DateDebutContrat;

    public Offre(int idOffre, String DescriptionPoste, String Intitule, String DateDebutPublication, String DateFinPublication, String NombrePoste, String Localisation, String OffreCastingcol, String DescriptionProfileRecherche, String Reference, String Mail, String DateDebutContrat) {
        this.idOffre = idOffre;
        this.DescriptionPoste = DescriptionPoste;
        this.Intitule = Intitule;
        this.DateDebutPublication = DateDebutPublication;
        this.DateFinPublication = DateFinPublication;
        this.NombrePoste = NombrePoste;
        this.Localisation = Localisation;
        this.OffreCastingcol = OffreCastingcol;
        this.DescriptionProfileRecherche = DescriptionProfileRecherche;
        this.Reference = Reference;
        this.Mail = Mail;
        this.DateDebutContrat = DateDebutContrat;
    }

    public Offre(String Intitule) {
        this.Intitule = Intitule;
    }

    public int getIdOffre() {
        return idOffre;
    }

    public void setIdOffre(int idOffre) {
        this.idOffre = idOffre;
    }

    public String getDescriptionPoste() {
        return DescriptionPoste;
    }

    public void setDescriptionPoste(String DescriptionPoste) {
        this.DescriptionPoste = DescriptionPoste;
    }

    public String getIntitule() {
        return Intitule;
    }

    public void setIntitule(String Intitule) {
        this.Intitule = Intitule;
    }

    public String getDateDebutPublication() {
        return DateDebutPublication;
    }

    public void setDateDebutPublication(String DateDebutPublication) {
        this.DateDebutPublication = DateDebutPublication;
    }

    public String getDateFinPublication() {
        return DateFinPublication;
    }

    public void setDateFinPublication(String DateFinPublication) {
        this.DateFinPublication = DateFinPublication;
    }

    public String getNombrePoste() {
        return NombrePoste;
    }

    public void setNombrePoste(String NombrePoste) {
        this.NombrePoste = NombrePoste;
    }

    public String getLocalisation() {
        return Localisation;
    }

    public void setLocalisation(String Localisation) {
        this.Localisation = Localisation;
    }

    public String getOffreCastingcol() {
        return OffreCastingcol;
    }

    public void setOffreCastingcol(String OffreCastingcol) {
        this.OffreCastingcol = OffreCastingcol;
    }

    public String getDescriptionProfileRecherche() {
        return DescriptionProfileRecherche;
    }

    public void setDescriptionProfileRecherche(String DescriptionProfileRecherche) {
        this.DescriptionProfileRecherche = DescriptionProfileRecherche;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public String getDateDebutContrat() {
        return DateDebutContrat;
    }

    public void setDateDebutContrat(String DateDebutContrat) {
        this.DateDebutContrat = DateDebutContrat;
    }
    
    
}
