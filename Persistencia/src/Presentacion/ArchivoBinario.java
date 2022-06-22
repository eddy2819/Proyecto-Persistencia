/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Clases.Nomina;
import Logica.LogBina;
import static Presentacion.ArchivoTexto.objetoLogicaClienteTxt;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Eddy Guarnizo
 * Fecha: 21 de Junio
 */
public class ArchivoBinario {
    static LogBina objLogicaBin = new LogBina();
     public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        AgregarBinario();
        AgregarBinario();
        ListarClienteBinario();     
    }
    
    void menuArchivoBinario() throws IOException, FileNotFoundException, ClassNotFoundException{
        
        Scanner scan = new Scanner(System.in);
        int num = 0;
        
        while( num < 4 ){   
           System.out.println("Agregar   1");
           System.out.println("Eliminar  2");
           System.out.println("Lstar     3");
           System.out.println("Salir     4");
            
            switch(num){
                case 1: AgregarBinario();    
                break;
                case 2: EliminarClienteBinario();
                break;
                case 3: ListarClienteBinario();
                break;
                
            }
        }
    }

    private static void AgregarBinario() throws IOException {
        
        Nomina objetoNomina = new Nomina();
        
        objetoNomina.setCedula(1);
        objetoNomina.setNombre("Eddy");
        objetoNomina.setAppellido("Guarnizo");
        objetoLogicaClienteTxt.ValidarId(objetoNomina);
        
        if (objetoLogicaClienteTxt.ValidarId(objetoNomina)) {
            System.out.println("Nomina agregada");          
        }
        else{
            System.out.println("Nomina invalido");    
        }
        
    }

    private static void ListarClienteBinario() throws IOException, FileNotFoundException, ClassNotFoundException {
        
        ArrayList<Nomina> ArrayNominas = new ArrayList<Nomina>();
        objLogicaBin.ListarNomina(ArrayNominas);
        for (Nomina tmpNom : ArrayNominas) {
            System.out.println(tmpNom.toString());
        }
    }

    private void EliminarClienteBinario() {
       
    }
    
}
