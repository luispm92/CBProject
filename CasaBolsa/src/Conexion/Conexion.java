/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 180910_GPO_SALINAS
 */
public class Conexion {
    
    private final static String URL = "jdbc:derby://localhost:1527/CasaDeBolsaDB";
    private final static String USUARIO = "usuario";
    private final static String PASSWORD = "usuario";
    
    public static Connection getConexion() {          
        try{
            return DriverManager.getConnection(URL, USUARIO, PASSWORD);
        }catch(Exception e){return null;}
    }
}
