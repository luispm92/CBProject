/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author 180910_GPO_SALINAS
 */
public class Portafolio {
    
    private LocalDate fechaApertura;
    private double saldoTotalAcciones;
    private LocalDate fechaCancelacion;
    private ArrayList<Acciones> acciones;
    private ArrayList<Movimiento> movimientos;

    public Portafolio(LocalDate fechaApertura, double saldoTotalAcciones, LocalDate fechaCancelacion, ArrayList<Acciones> acciones, ArrayList<Movimiento> movimientos) {
        this.fechaApertura = fechaApertura;
        this.saldoTotalAcciones = saldoTotalAcciones;
        this.fechaCancelacion = fechaCancelacion;
        this.acciones = acciones;
        this.movimientos = movimientos;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getSaldoTotalAcciones() {
        return saldoTotalAcciones;
    }

    public void setSaldoTotalAcciones(double saldoTotalAcciones) {
        this.saldoTotalAcciones = saldoTotalAcciones;
    }

    public LocalDate getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(LocalDate fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public ArrayList<Acciones> getAcciones() {
        return acciones;
    }

    public void setAcciones(ArrayList<Acciones> acciones) {
        this.acciones = acciones;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    @Override
    public String toString() {
        return "Portafolio{" + "fechaApertura=" + fechaApertura + ", saldoTotalAcciones=" + saldoTotalAcciones + ", fechaCancelacion=" + fechaCancelacion + ", acciones=" + acciones + ", movimientos=" + movimientos + '}';
    }
    
    
    
}
