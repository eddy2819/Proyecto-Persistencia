/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Clases.Nomina;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class BaseDatos {
    DATConexion con = new DATConexion();
   ResultSet rs;
   PreparedStatement ps = null;

    public boolean InsertarNominaDB(Nomina objNomina) throws SQLException {
        String sql = "INSERT INTO Persistencia (cedula,Nombre,apellido,num,codigo,producto,precio) "
                + "VALUES (?,?,?,?,?,?)";
        try {
            ps = con.AbrirConexion().prepareStatement(sql);
            ps.setInt(1, objNomina.getCedula());
            ps.setString(2, objNomina.getNombre());
            ps.setString(3,objNomina.getAppellido());
            ps.setInt(7,objNomina.getNum());
            ps.setString(4,objNomina.getCodigo());
            ps.setString(5,objNomina.getNProducto());
            ps.setInt(6,objNomina.getPrecio());
            ps.execute();
            System.out.println("Nomina insertada");
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(3);
            }
        }       
    }

    public ResultSet RecuperarNomina() throws ClassNotFoundException, SQLException {
        java.sql.Statement st = con.AbrirConexion().createStatement();
        String sentencia = "SELECT * FROM Cliente";
        rs = st.executeQuery(sentencia);
        return rs;
    }
    
}
