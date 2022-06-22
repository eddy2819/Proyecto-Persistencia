/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Archivos.BaseDatos;
import Clases.Nomina;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.mysql.jdbc.ResultSetMetaData;

/**
 *
 * @author DELL
 */
public class LogBD {
    BaseDatos objnominaDB = new BaseDatos();
    
    public void IsertarClienteDB(ArrayList<Nomina> ArrayNominas) throws SQLException {
        for (Nomina objnomina : ArrayNominas){
            objnominaDB.InsertarNominaDB(objnomina);
        }
        
        
    }

   public void RecuperarClientes(ArrayList<Nomina> ArrayClientes) throws SQLException, ClassNotFoundException {
        ResultSet rs = objnominaDB.RecuperarNomina();
        ResultSetMetaData rm =  (ResultSetMetaData) rs.getMetaData();
        //Recupera los campos de la tabla
        int columnCount = rm.getColumnCount();
        ArrayList<String> columnas = new ArrayList<>();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = rm.getColumnName(i);
            columnas.add(columnName);
        }
        //Envia los datos a la Clase
        while (rs.next()) {
            Nomina objAux = new Nomina();
            for (String columnName : columnas) {
                String value = rs.getString(columnName);
                if (columnName.equals("identidad")) {
                    objAux.setCedula(Integer.parseInt(value));
                }
                if (columnName.equals("nombre")) {
                    objAux.setNombre(value);
                }
                if (columnName.equals("apellido")) {
                    objAux.setAppellido(value);
                }
            }
            ArrayClientes.add(objAux);
        }
        //return ;
    }

    
}
