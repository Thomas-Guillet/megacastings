/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassNameDAO;

import ClassName.Administrateur;
import static ClassNameDAO.ConnexionDAO.afficherAdministrateur;
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
public class AdministrateurDAO {
    public static void connexion(Connection cn, Administrateur Login) throws ClassCastException, SQLException{
        Statement statement = cn.createStatement();
        
        ResultSet rs = statement.executeQuery("SELECT ID FROM admin");
        
        int i = 0;
        while(rs.next()){
            Login.setId(rs.getInt('ID'));
            i = rs.getInt("ID");
        }
        if(i == 0){
            javax.swing.JOptionPane.showMessageDialog(null, "Mot de Passe ou Email incorrect");
        } else {
                afficherAdministrateur(cn);
                Accueil accueil = new Accueil();
                accueil.setVisible(true);
                Connexion connexion = new Connexion();
                connexion.setVisible(false);            
        }
    }
}