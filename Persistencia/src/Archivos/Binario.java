/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Clases.Nomina;
import Logica.MiObjectOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Eddy Guarnizo
 * Fecha: 21 de junio 
 */
public class Binario {
    static File fichero = new File("Persistencia.dat");
    public static boolean GrabarBinario(ArrayList<Nomina> ArrayNominas) throws FileNotFoundException, IOException{
        ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream(fichero,false));  //elimine o cree
        for (Nomina ObjCliente:  ArrayNominas){
            // grabar todo el objeto
            oos.writeObject(ObjCliente);
        }
        oos.close();  // Se cierra al terminar.
        return true;
    }
    public static void ImportarBinario(ArrayList<Nomina> ArrayNominas) throws FileNotFoundException, IOException, ClassNotFoundException{
        try
        {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(fichero));
            Nomina aux = (Nomina) ois.readObject();
            while (aux!=null){
                if (aux instanceof Nomina) {               
                    //System.out.println(aux);
                    ArrayNominas.add((Nomina)aux);
                }
                aux = (Nomina) ois.readObject();
            }
            ois.close();
        }
        catch (EOFException e1)
        {
            System.out.println ("Fin de archivo");
        }
        catch (Exception e2)
        {
            e2.printStackTrace();
        }
        
    }
    
    public static void AddBinario (ArrayList<Nomina> ArrayClientes)
    {
        try
        {
            // Se usa un ObjectOutputStream que no escriba una cabecera en
            // el stream.
            MiObjectOutputStream oos = new MiObjectOutputStream(
                    new FileOutputStream(fichero,true));
            // Se hace el new fuera del bucle, s�lo hay una instancia de persona.
            // Se debe usar entonces writeUnshared().
            for (Nomina ObjCliente:  ArrayClientes){
                oos.writeUnshared(ObjCliente);
        }
        oos.close();  // Se cierra al terminar.
            oos.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    
}
