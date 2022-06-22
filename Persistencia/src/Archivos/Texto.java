/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Clases.Nomina;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author DELL
 */
public class Texto {
    public boolean Agregartxt(Nomina objetonomina) throws IOException{
        File file = new File("Nomina.txt");
        FileWriter fileWrite = new FileWriter(file,false);
        
        BufferedWriter bufferWrite = new BufferedWriter(fileWrite);
        bufferWrite.write(Integer.toString(objetonomina.getCedula())+",");
        bufferWrite.write(String.valueOf(objetonomina.getNombre())+",");
        bufferWrite.write(String.valueOf(objetonomina.getAppellido())+"\n");
        bufferWrite.write(String.valueOf(objetonomina.getCodigo())+ "\n");
        bufferWrite.write(String.valueOf(objetonomina.getNProducto())+ "\n");
        bufferWrite.write(Integer.toString(objetonomina.getPrecio())+ "\n");
        bufferWrite.write(String.valueOf(objetonomina.getCodigo())+ "\n");
        

        bufferWrite.close();
        fileWrite.close();
        return true;
    }
    
    public static ArrayList<Nomina> Leertxt(ArrayList<Nomina> ArrayClientes){        
        File f = new File("Usuarios.txt");        
        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {            
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ",");
                while (st.hasMoreTokens()){
                     Nomina Objtmp = new Nomina(
                             Integer.valueOf(st.nextToken()), 
                             st.nextToken(),
                             st.nextToken(), 
                             st.nextToken(),
                             st.nextToken(),
                             Integer.valueOf(st.nextToken()),
                             st.nextToken()
                     );
                     ArrayClientes.add(Objtmp);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
        return ArrayClientes;
    }
    
}
