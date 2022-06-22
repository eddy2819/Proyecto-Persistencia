/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author DELL
 */
public class Nomina extends Usuarios  {
    int precio;
    String NProducto;
    String Codigo;
    Usuarios user;

    public Nomina() {
        
    }

    public Nomina(int precio, String NProducto, String Codigo, Usuarios user) {
        this.precio = precio;
        this.NProducto = NProducto;
        this.Codigo = Codigo;
        this.user = user;
    }

    public Nomina(Integer valueOf, String nextToken, String nextToken0, String nextToken1, String nextToken2, Integer valueOf0, String nextToken3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    

   

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setNProducto(String NProducto) {
        this.NProducto = NProducto;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNProducto() {
        return NProducto;
    }

    public String getCodigo() {
        return Codigo;
        
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
        return "Nomina{" + "precio=" + precio + ", NProducto=" + NProducto + ", Codigo=" + Codigo + ", user=" + user + '}';
    }
    
    

    
    
    
    
    
    
}
