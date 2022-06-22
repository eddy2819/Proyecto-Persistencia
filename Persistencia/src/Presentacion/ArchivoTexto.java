/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Clases.Nomina;
import Logica.LogText;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ArchivoTexto {
    static LogText objetoLogicaClienteTxt = new LogText();
    
    public static void main(String[] args) throws IOException {
       
        AgregarTexto();
        AgregarTexto();
        ListarTexto();
    }
    
    void menuArchivoTexto() throws IOException{
        
        Scanner scan = new Scanner(System.in);
        int num = 0;
        
        while( num < 4 ){   
           
            System.out.println("Agregar   1");
            System.out.println("Eliminar  2");
            System.out.println("Lstar     3");
            System.out.println("Salir     4");
           
            num = scan.nextInt();
            
            switch(num){
                case 1: AgregarTexto();    
                break;
                case 2: EliminarClienteTexto();
                break;
                case 3: ListarTexto();
                break;
                
            }
        }
    }

    private static void AgregarTexto() throws IOException {
        
        Nomina objetoNomina = new Nomina();
        
        objetoNomina.setCedula(1);
        objetoNomina.setNombre("Eddy ");
        objetoNomina.setAppellido("15/06/2022");
        objetoLogicaClienteTxt.ValidarId(objetoNomina);
        
        if (objetoLogicaClienteTxt.ValidarId(objetoNomina)) {
            System.out.println("Cliente agregado");          
        }
        else{
            System.out.println("Codigo invalido");    
        }
    }

    private void EliminarClienteTexto() {
    
    }

    private static void ListarTexto() {
        ArrayList<Nomina> ArrayNominas = new ArrayList<Nomina>();
        objetoLogicaClienteTxt.ListarNominas(ArrayNominas);
        for (Nomina tmpnomina : ArrayNominas) {
            System.out.println(tmpnomina.toString());
        }
        System.out.println(objetoLogicaClienteTxt);
    }
    
    
}
