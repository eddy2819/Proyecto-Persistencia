/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Eddy Guarnizo
 * Fecha: 21 de junio
 */
public class DATConexion {
    public Connection con;
    public Connection getConnection () throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/Nominas";
        System.out.println("llego");
        Class.forName(driver);
        return DriverManager.getConnection(url,"root","");
    }
    public Connection AbrirConexion() throws ClassNotFoundException, SQLException{
        con = getConnection();
        return con;
    }
    public void CerrarConexion() throws SQLException{
       con.close();
    }
    
}
