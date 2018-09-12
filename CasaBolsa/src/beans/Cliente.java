/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author 180910_GPO_SALINAS
 */
public class Cliente extends Persona{
    
    private int claveCliente;
    private String rfc;
    private Portafolio portafolio;

    public Cliente(){
        super();
    }
    
    public Cliente(int claveCliente,String nombre, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento, Domicilio domicilio, String rfc, Portafolio portafolio) {
        super(nombre, apellidoPaterno, apellidoMaterno, domicilio, fechaNacimiento);
        this.claveCliente = claveCliente;
        this.rfc = rfc;
        this.portafolio = portafolio;
    }

    public int getClaveCliente() {
        return claveCliente;
    }

    public void setClaveCliente(int claveCliente) {
        this.claveCliente = claveCliente;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public Portafolio getPortafolio() {
        return portafolio;
    }

    public void setPortafolio(Portafolio portafolio) {
        this.portafolio = portafolio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.claveCliente != other.claveCliente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "claveCliente=" + claveCliente + ", rfc=" + rfc + ", portafolio=" + portafolio + '}';
    }
}
