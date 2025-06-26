/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author maza-
 */
public class TarjetaVIP implements TarjetaCredito{
    public double costoAnual;
    public double LimiteAnual;
    
    public TarjetaVIP(){
        this.costoAnual = 90.0;
        this.LimiteAnual = 6000.0;
    }


    @Override
    public String getTipo() {
        return "Tarjeta VIP";
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
