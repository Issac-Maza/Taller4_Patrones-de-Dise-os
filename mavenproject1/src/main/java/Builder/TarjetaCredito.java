/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t.patronesdiseno;

/**
 *
 * @author heriv
 */
public class TarjetaCredito {
    private String tipo;
    private double costoAnual;
    private double limiteCredito;

    // Constructor privado, solo accesible a través del Builder
    TarjetaCredito(TarjetaCreditoBuilder builder) {
        this.tipo = builder.tipo;
        this.costoAnual = builder.costoAnual;
        this.limiteCredito = builder.limiteCredito;
    }

    // Métodos getter
    public String getTipo() {
        return tipo;
    }

    public double getCostoAnual() {
        return costoAnual;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "tipo='" + tipo + '\'' +
                ", costoAnual=" + costoAnual +
                ", limiteCredito=" + limiteCredito +
                '}';
    }
}


