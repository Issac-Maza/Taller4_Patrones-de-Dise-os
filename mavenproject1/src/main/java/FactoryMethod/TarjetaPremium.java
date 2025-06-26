/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author maza-
 */
public class TarjetaPremium implements TarjetaCredito{
    public double costoAnual;
    public double LimiteAnual;
    
    public TarjetaPremium(){
        this.costoAnual = 60.0;
        this.LimiteAnual = 1500.0;
    }

    
    @Override
    public String getTipo() {
        return "Tarjeta Premium";
    }

    
    @Override
    public double getCostoAnual() {
        return this.costoAnual;
    }

    
    @Override
    public double getLimiteCredito() {
        return this.LimiteAnual;
    }

    @Override
    public void realizarPago() {
        System.out.println("Pago realizado");
    }
    
}
