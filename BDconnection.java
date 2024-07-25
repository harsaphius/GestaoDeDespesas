
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hugo.poeira
 */
public class BDconnection {
    
Connection connect;
    String url = "jdbc:mysql://localhost:3306/despesas"; // caminho para ligação à bd
    String user = "root"; //user root vem por defaut
    String password = ""; // vazia por default on user root
    //String driver = "con.mysql.jdbc.Driver";
    
    public void OpenConnection()
    {
        try{
            
            connect = DriverManager.getConnection(url, user, password);
            
        }catch (Exception e){System.err.println(e);}
    }
}