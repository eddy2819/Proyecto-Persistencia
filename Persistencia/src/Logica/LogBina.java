/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Archivos.Binario;
import Clases.Nomina;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Eddy Guarnizo
 * Fecha: 21 de Junio
 */
public class LogBina {
    Binario objetoBinario = new Binario();
    
    public boolean ValidarId( Nomina objetonomina) throws IOException {
        
        ArrayList<Nomina> ArrayNominas = new ArrayList<Nomina>();
        if (objetonomina.getCedula() > 0) {         
           ArrayNominas.add(objetonomina);
           return objetoBinario.GrabarBinario(ArrayNominas);
        } 
        return false;
    }
    
    public void ListarNomina(ArrayList<Nomina>ArrayClientes) throws IOException, FileNotFoundException, ClassNotFoundException{
        objetoBinario.ImportarBinario(ArrayClientes);
    }  
    
}
