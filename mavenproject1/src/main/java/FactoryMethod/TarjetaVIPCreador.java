/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author maza-
 */
public class TarjetaVIPCreador extends TarjetaCreador{

    @Override
    public TarjetaCredito crearTarjeta() {
        return new TarjetaVIP();
    }
    
}
