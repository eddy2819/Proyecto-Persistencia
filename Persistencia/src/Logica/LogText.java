/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Archivos.Texto;
import Clases.Nomina;
import Presentacion.ArchivoTexto;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class LogText {
    Texto objetonominaTxt = new Texto();
    ArchivoTexto objetoArchivoTexto = new ArchivoTexto();
    
    public boolean ValidarId( Nomina objetonomina) throws IOException {
        if (objetonomina.getCedula() > 0) {                     
           return objetonominaTxt.Agregartxt(objetonomina);
        } 
        return false;
    }
    
    public void ListarNominas(ArrayList<Nomina>ArrayNominas){
        objetonominaTxt.Leertxt(ArrayNominas);
    }  
    
}
