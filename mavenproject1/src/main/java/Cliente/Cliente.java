/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import FactoryMethod.TarjetaCredito;

/**
 *
 * @author maza-
 */
public class Cliente {
    private String nombre;
    private double salario;
    private TarjetaCredito tarjeta;
    
    public Cliente(String nombre,double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }
      
    
    
}
