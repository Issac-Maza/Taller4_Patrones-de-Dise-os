/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author maza-
 */
public class TarjetaBasicaCreador extends TarjetaCreador{

    @Override
    public TarjetaCredito crearTarjeta() {
        return new TarjetaBasica();
    }
    
}
