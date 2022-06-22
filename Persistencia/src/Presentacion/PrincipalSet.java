/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Eddy Guarnizo
 * Fecha: 21 de Junio
 */
public class PrincipalSet {
    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        ArchivoTexto objetoTexto = new ArchivoTexto();
        int num = 0;
        
        while( num < 4 ){     
            
            System.out.println("Texto     1");
            System.out.println("Binario   2");
            System.out.println("Data Base 3");
            System.out.println("Salir     4");
            
            num = scan.nextInt();
            
            switch(num){
                case 1: objetoTexto.menuArchivoTexto();
                break;
//                case 2: menuBinario();
//                break;
//                case 3: menuDataBase();
//                break;
                
            }
        }
    }
}
