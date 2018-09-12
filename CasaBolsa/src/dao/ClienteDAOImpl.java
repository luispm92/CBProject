/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Cliente;
import java.util.List;

/**
 *
 * @author 180910_GPO_SALINAS
 */
public interface ClienteDAOImpl {
    
    public List<Cliente> consultarClientes();
    public Cliente consultarCliente(int id);
    
}
