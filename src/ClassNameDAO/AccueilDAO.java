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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author thoma
 */
public class AccueilDAO {      
    public static Collection<Offre> afficher_list_offre(Connection cn) throws ClassCastException, SQLException{
         Statement statement = cn.createStatement();   
                    ResultSet rs = statement.executeQuery("SELECT * FROM offrecasting");
                    Collection<Offre> list_offre = new ArrayList();
                    while(rs.next())
                    { 
                        list_offre.add(new Offre(rs.getString("Intitule")));
                    }
         
                return list_offre;
    }
}
