/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casadebolsa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import beans.Cliente;
import dao.ClienteDAO;
import dao.ClienteDAOImpl;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author 180910_GPO_SALINAS
 */
public class CasaDeBolsa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
        try{            
            ClienteDAOImpl dao = new ClienteDAO();
            List<Cliente> clientes = dao.consultarClientes();
            
            for(Cliente c: clientes)
                System.out.println(c.getNombre());
            
            int idCliente = 2;
            
            Cliente cl = dao.consultarCliente(idCliente);
            if(cl!=null)
                System.out.println("Cliente Encontrado:"+cl.getNombre());
        
        }catch(Exception e){}
        
    }
    
}
