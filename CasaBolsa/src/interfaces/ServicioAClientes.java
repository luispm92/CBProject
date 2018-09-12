/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import beans.Cliente;

/**
 *
 * @author 180910_GPO_SALINAS
 */
public interface ServicioAClientes {
    
    public void altaCliente();
    public void bajaCliente();
    public void cambioDatosCliente();
    public Cliente consultarCliente();
    public void listarClientes();
    
}
