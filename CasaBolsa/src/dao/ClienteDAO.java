/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Cliente;
import java.util.List;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author 180910_GPO_SALINAS
 */
public class ClienteDAO implements ClienteDAOImpl{
    
    public ClienteDAO(){}

    @Override
    public List<Cliente> consultarClientes() {
        
        List<Cliente> clientes=null;
        Cliente cliente;
        String query = "SELECT * FROM CLIENTE";
        
        try(
            Connection con = Conexion.getConexion();        
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();     
        ){        
            if(rs!=null){
                clientes = new ArrayList<>();                    
                while(rs.next()){
                    cliente = new Cliente();
                    cliente.setClaveCliente(rs.getInt("IDCLIENTE"));
                    cliente.setNombre(rs.getString("NOMBRE"));
                    cliente.setApellidoPaterno(rs.getString("APELLIDOPATERNO"));
                    cliente.setApellidoMaterno(rs.getString("APELLIDOMATERNO"));
                    cliente.setFechaNacimiento(rs.getDate("FECHANACIMIENTO"));
                    cliente.setRfc("RFC");
                    clientes.add(cliente);
                }
            }

        }catch(Exception e){
            System.out.println("Detalle en DAO de consulta a Clientes");
        }
        return clientes;
    }

    @Override
    public Cliente consultarCliente(int id) {
        
        Cliente clienteEncontrado = null;

        try{
            Optional<Cliente> cl = consultarClientes().stream()
                    .filter(c->c.getClaveCliente()==id).findFirst();
            
            if (cl.isPresent())
                clienteEncontrado = cl.get();
        
        }catch(Exception e){}
        
        return clienteEncontrado;
    }
    
}
