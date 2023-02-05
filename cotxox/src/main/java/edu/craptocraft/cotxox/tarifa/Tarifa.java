package edu.craptocraft.cotxox.tarifa;

import edu.craptocraft.cotxox.carrera.Carrera;

public class Tarifa {

    final static double COSTE_MILLA = 1.35;
    final static double COSTE_MINUTO = 0.35;
    final static double COSTE_MINIMO = 5;
    final static byte PORCENTAJE_COMISION = 20;

    public static double getCosteDistancia(double distancia) {
        return distancia * COSTE_MILLA;
    }

    public static double getCosteTiempo(int tiempoEsperado) {
        return tiempoEsperado * COSTE_MINIMO;
    }

    public static double getCosteTotalEsperado(Carrera carrera) {
        double costeTotal = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());

        if (costeTotal > COSTE_MINIMO) {
            return costeTotal;
        } else {
            costeTotal = COSTE_MINIMO;
            return costeTotal;
        }

    }

}
