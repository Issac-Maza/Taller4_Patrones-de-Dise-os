/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package espol.poo.mavenproject1;

import Cliente.Cliente;
import FactoryMethod.TarjetaBasicaCreador;
import FactoryMethod.TarjetaCreador;
import FactoryMethod.TarjetaPremiumCreador;
import FactoryMethod.TarjetaVIPCreador;

/**
 *
 * @author maza-
 */
public class Tallerpatrones {

    public static void main(String[] args) {
        Cliente clienteBajo = new Cliente("Sofia",120.0); 
        Cliente clienteMedio = new Cliente("Mauricio",600.0);
        Cliente clienteAlta = new Cliente("Nepomunesa",1200.0);
        
        TarjetaCreador bTarjeta = new TarjetaBasicaCreador();
        //TarjetaCredito basica = bTarjeta.crearTarjeta();
        
        TarjetaCreador pTarjeta = new TarjetaPremiumCreador();
        //TarjetaCredito premium = pTarjeta.crearTarjeta();
        
        TarjetaCreador vTarjeta = new TarjetaVIPCreador();
        //TarjetaCredito vip = vTarjeta.crearTarjeta();
        
        clienteBajo.setTarjeta(bTarjeta.crearTarjeta());
        clienteMedio.setTarjeta(pTarjeta.crearTarjeta());
        clienteAlta.setTarjeta(vTarjeta.crearTarjeta());
        
        clienteBajo.getTarjeta().realizarPago();
        clienteMedio.getTarjeta().realizarPago();
        clienteAlta.getTarjeta().realizarPago();
        
    }
}
