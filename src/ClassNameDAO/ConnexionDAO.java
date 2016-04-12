/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassNameDAO;

import ClassName.Administrateur;
import com.mysql.jdbc.Connection;
import fenetreJframe.Accueil;
import fenetreJframe.Connexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author thoma
 */
public class ConnexionDAO {
    public static void connexion(Connection cn, Administrateur Login) throws ClassNotFoundException, SQLException {
        Statement statement = cn.createStatement();
        
        ResultSet rs = statement.executeQuery("SELECT * FROM admin WHERE mail ='" + Login.getEmail() + "' AND password ='" + Login.getPassword() + "'");
        
        if(rs.next()){
            Login.setEmail(rs.getString("mail"));
            Login.setPassword(rs.getString("password"));
            Login.setNom(rs.getString("nom"));
            Login.setPrenom(rs.getString("prenom"));
        
            Accueil accueil = new Accueil(Login);
            accueil.setVisible(true);     
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Mot de Passe ou Email incorrect");
        }
    }
    
   /* public static void afficherAdministrateur(Connection cn) throws ClassCastException, SQLException{
        Statement statement = cn.createStatement();
 
            ResultSet resultat = statement.executeQuery("SELECT * FROM admin");
            while(resultat.next()){
                System.out.println("Nom du client: "+resultat.getString("mail"));
                System.out.println("Mot de passe: "+resultat.getString("password")); 
            }
        }*/
}
