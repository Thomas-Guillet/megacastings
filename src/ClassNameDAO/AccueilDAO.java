/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassNameDAO;

import ClassName.Administrateur;
import ClassName.Offre;
import com.mysql.jdbc.Connection;
import fenetreJframe.Accueil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author thoma
 */
public class AccueilDAO {      
    public static Collection<Offre> recuperer_id_offre(Connection cn) throws ClassCastException, SQLException{
         Statement statement = cn.createStatement();   
                    ResultSet rs = statement.executeQuery("SELECT idOffre FROM offrecasting");
                    Collection<Offre> list_offre = new ArrayList();
                    while(rs.next())
                    { 
                        list_offre.add(new Offre(rs.getInt("idOffre")));
                    }
         
                return list_offre;
    }
    
        public static ArrayList afficher_list_offre(Connection cn) throws ClassCastException, SQLException{
         Statement statement = cn.createStatement();   
                    ResultSet rs = statement.executeQuery("SELECT Intitule FROM offrecasting");
                    ArrayList list_offre_intitule = new ArrayList();
                    while(rs.next())
                    { 
                        list_offre_intitule.add(rs.getString("Intitule"));
                    }
         
                return list_offre_intitule;
    }
    
    public static int requete_sql(Connection cn, Object idoffre, Offre offre) throws ClassCastException, SQLException{
        Statement statement = cn.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM offrecasting WHERE idOffre ='" + idoffre + "'");
        int ivi = 0;
        if(rs.next()){
            offre.setIntitule(rs.getString("Intitule"));
            offre.setDescriptionPoste(rs.getString("DescriptionPoste"));
            offre.setLocalisation(rs.getString("Localisation"));
        
        } else {
            
        }
        return ivi;
    }
   
 
}
    
    

