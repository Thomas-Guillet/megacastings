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
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author thoma
 */
public class AdministrateurDAO {
    
    private static int Id=0;
    private static String Email;
    private static String Password;
    
    public static Collection<Administrateur> ListerAdmin(Connection cn) throws ClassCastException, SQLException{
        Statement statement = cn.createStatement();
        
        ResultSet rs = statement.executeQuery("SELECT ID FROM admin");
        
        Collection<Administrateur> admin = new ArrayList();
        
        while(rs.next()){
            admin.add(new Administrateur(Email, Password));
        }
        return admin;
    }
}