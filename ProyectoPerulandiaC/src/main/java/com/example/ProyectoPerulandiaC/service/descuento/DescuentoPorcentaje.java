package com.example.ProyectoPerulandiaC.service.descuento;

public class DescuentoPorcentaje implements Descuento {

    private int porcentaje;

    public DescuentoPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicar(double precioOriginal) {
        return precioOriginal - (precioOriginal * porcentaje / 100.0);
    }
}
