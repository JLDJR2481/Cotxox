package edu.craptocraft.cotxox.tarifa;

import edu.craptocraft.cotxox.carrera.Carrera;

public class Tarifa {

    static final double COSTE_MILLA = 1.35d;
    static final double COSTE_MINUTO = 0.35d;
    static final double COSTE_MINIMO = 5d;
    static final byte PORCENTAJE_COMISION = 20;

    public Tarifa() {
    };

    public static double getCosteDistancia(double distancia) {

        return distancia * COSTE_MILLA;
    };

    public static double getCosteTiempo(int tiempoEsperado) {
        return tiempoEsperado * COSTE_MINUTO;
    }

    public static double getCosteTotalEsperado(Carrera carrera) {

        double costeTotal = Tarifa.getCosteDistancia(carrera.getDistancia())
                + Tarifa.getCosteTiempo(carrera.getTiempoEsperado());

        if (costeTotal <= 5) {
            costeTotal = 5.00d;
        }

        return costeTotal;

    }

}
