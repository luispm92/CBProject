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
public class Domicilio {
    
    private int id;
    private String calle;
    private String numero;
    private String colonia;
    private String localidad;
    private String estado;
    private String codigoPostal;

    public Domicilio(int id, String calle, String numero, String colonia, String localidad, String estado, String codigoPostal) {
        this.id=id;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.localidad = localidad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "calle=" + calle + ", numero=" + numero + ", colonia=" + colonia + ", localidad=" + localidad + ", estado=" + estado + ", codigoPostal=" + codigoPostal + '}';
    }
        
}
