/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import java.util.Map;

/**
 *
 * @author USUARIO
 */
public class FacadeCanales {
    private Canal transaccion;
    private Map<String,Canal> links;
    
    public void usar(String canal){
        transaccion = links.get(canal);
    }
}
