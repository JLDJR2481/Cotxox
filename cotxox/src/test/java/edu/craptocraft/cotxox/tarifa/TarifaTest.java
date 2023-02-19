package edu.craptocraft.cotxox.tarifa;

import edu.craptocraft.cotxox.carrera.Carrera;

import org.junit.Test;

import static org.junit.Assert.*;

public class TarifaTest {

    Carrera carrera = new Carrera("9999212388849102");

    @Test
    public void costeDistanciaTest() {
        double distancia = 7.75d;
        double expected = 10.4625d;
        double delta = 0.01d;

        assertEquals(expected, Tarifa.getCosteDistancia(distancia), delta);
    }

    @Test
    public void costeTiempoTest() {
        int tiempoEsperado = 10;
        double expected = 3.5d;
        double delta = 0.01d;

        assertEquals(expected, Tarifa.getCosteTiempo(tiempoEsperado), delta);

    }

    @Test
    public void costeTotalTest() {
        carrera.setDistancia(7.75d);
        carrera.setTiempoEsperado(10);

        double costeTotal = (Tarifa.getCosteDistancia(carrera.getDistancia())
                + Tarifa.getCosteTiempo(carrera.getTiempoEsperado()));

        double delta = 0.01d;

        assertEquals(costeTotal, Tarifa.getCosteTotalEsperado(carrera), delta);
    }

    @Test
    public void minimoCosteTest() {
        carrera.setDistancia(2.0);
        carrera.setTiempoEsperado(5);
        double delta = 0.01;

        assertEquals(5, Tarifa.getCosteTotalEsperado(carrera), delta);

    }
}
