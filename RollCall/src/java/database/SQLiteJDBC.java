/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.SQLException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.sqlite.SQLiteDataSource;

/**
 *
 * @author moolm
 */
public class SQLiteJDBC {
    //externally sourced code
    public Connection SQLconnect(){//used to connect to database
        try {
            Connection c;
            Class.forName("org.sqlite.JDBC");
            SQLiteDataSource ds = new SQLiteDataSource();
            ds.setUrl("jdbc:sqlite:C:\\Users\\moolm\\Documents\\GitHub\\RollCall\\RollCall\\src\\java\\database\\Users.db");
            c = ds.getConnection();
            
            return c;
        } catch (ClassNotFoundException ex) {
            System.out.println("Connection to Users failure.");
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteJDBC.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
