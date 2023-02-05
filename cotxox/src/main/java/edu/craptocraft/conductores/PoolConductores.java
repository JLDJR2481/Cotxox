package edu.craptocraft.conductores;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class PoolConductores {

    private List<Conductor> poolConductores = new ArrayList<Conductor>();

    public PoolConductores(List<Conductor> poolConductores) {
        this.poolConductores = poolConductores;
    }

    public List<Conductor> getPoolConductores() {
        return this.poolConductores;
    }

    public Conductor asignarConductor() {

        Conductor conductor = new Conductor();
        Random random = new Random();
        boolean asignado = false;

        while (!asignado) {
            int i = random.nextInt(getPoolConductores().size());
            conductor = getPoolConductores().get(i);

            if (!conductor.isOcupado()) {
                conductor.setOcupado(true);
                asignado = true;
            }
        }
        return conductor;

    }

}
