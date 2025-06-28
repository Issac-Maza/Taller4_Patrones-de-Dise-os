package com.mycompany.t.patronesdiseno;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heriv
 */
public class TarjetaCreditoBuilder {
    // Atributos necesarios para crear una TarjetaCredito
    protected String tipo;
    protected double costoAnual;
    protected double limiteCredito;

    // Métodos setter que retornan el Builder para permitir encadenar llamadas
    public TarjetaCreditoBuilder setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public TarjetaCreditoBuilder setCostoAnual(double costoAnual) {
        this.costoAnual = costoAnual;
        return this;
    }

    public TarjetaCreditoBuilder setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
        return this;
    }

    // Método para construir el objeto final
    public TarjetaCredito build() {
        return new TarjetaCredito(this);
    }

}

