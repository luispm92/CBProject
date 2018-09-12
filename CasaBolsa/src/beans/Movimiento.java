/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.time.LocalDateTime;

/**
 *
 * @author 180910_GPO_SALINAS
 */
public class Movimiento {
    
    private int folio;
    private LocalDateTime fecha;
    private int tipo;
    private double monto;
    private String descripcion;
    private Acciones accion;

    public Movimiento(int folio, LocalDateTime fecha, int tipo, double monto, String descripcion, Acciones accion) {
        this.folio = folio;
        this.fecha = fecha;
        this.tipo = tipo;
        this.monto = monto;
        this.descripcion = descripcion;
        this.accion = accion;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Acciones getAccion() {
        return accion;
    }

    public void setAccion(Acciones accion) {
        this.accion = accion;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "folio=" + folio + ", fecha=" + fecha + ", tipo=" + tipo + ", monto=" + monto + ", descripcion=" + descripcion + ", accion=" + accion + '}';
    }
    
}
