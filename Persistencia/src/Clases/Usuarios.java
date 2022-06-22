/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class Usuarios implements Serializable{
    int cedula;
    String nombre;
    String appellido;
    int num;

    public Usuarios() {
    }

    public Usuarios(int cedula, String nombre, String appellido, int num) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.appellido = appellido;
        this.num = num;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAppellido(String appellido) {
        this.appellido = appellido;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAppellido() {
        return appellido;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "cedula=" + cedula + ", nombre=" + nombre + ", appellido=" + appellido + ", num=" + num + '}';
    }
    
}

