package edu.craptocraft.cotxox.carrera;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarreraTest {

    String tarjetaCredito = "4916119711304546";
    String origen = "Aeroport Son Sant Joan";
    String destino = "Magaluf";
    double distancia = 7.75;
    int tiempoEsperado = 10;
    Carrera carrera = new Carrera(tarjetaCredito);

    @Test
    public void constructorTest() {
        assertNotNull(carrera);

        String expected = "4916119711304546";

        assertEquals(expected, carrera.getTarjetaCredito());
    }

    @Test
    public void origenTest() {

        carrera.setOrigen(origen);
        assertNotNull(origen);

        assertEquals(origen, carrera.getOrigen());
    }

    @Test
    public void destinoTest() {

        carrera.setDestino(destino);
        assertNotNull(destino);

        assertEquals(destino, carrera.getDestino());

        assertNotEquals("Manacor", carrera.getDestino());
    }

    @Test
    public void distanciaTest() {
        carrera.setDistancia(distancia);

        assertNotNull(distancia);
    }
}
