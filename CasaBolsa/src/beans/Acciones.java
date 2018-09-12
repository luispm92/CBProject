/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author 180910_GPO_SALINAS
 */
public class Acciones {
    
    private String simbolo;
    private double precio;
    private int cantidad;

    public Acciones(String simbolo, double precio, int cantidad) {
        this.simbolo = simbolo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
