/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Clases.Nomina;
import Logica.LogBD;
import Logica.LogBina;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Eddy Guarnizo
 * Fecha: 21 de junio 
 */
public class DataBase {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        ArrayList<Nomina> ArrayNominas =new ArrayList<Nomina>();
        LogBD objDB = new LogBD();
        
        
        ArrayNominas.add(new Nomina(0,"Eddy","05/2020","","",1,""));
        ArrayNominas.add(new Nomina(0,"Eddy","05/2020","","",1,""));
        ArrayNominas.add(new Nomina(0,"Eddy","05/2020","","",1,""));
        objDB.IsertarClienteDB(ArrayNominas);
        
        ArrayNominas = new ArrayList<Nomina>();
        ArrayNominas.removeAll(ArrayNominas);
        
        objDB.RecuperarClientes(ArrayNominas);
        
        for (Nomina objNomina: ArrayNominas){
            System.out.println(objNomina.toString());
        } 
    }
}
