package edu.craptocraft.cotxox.conductores;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PoolConductoresTest {

    @Test
    public void poolConductoresTest() {
        List<Conductor> poolConductores = new ArrayList<Conductor>();
        Conductor conductor;

        String[] nombres = { "Samuel", "David", "Jaume" };
        for (String nombre : nombres) {
            conductor = new Conductor(nombre);
            poolConductores.add(conductor);

        }

        String[] matricula = { "9983GHT", "9183THS", "8475DRS" };
        String[] modelos = { "Audi TT", "Tesla Roadster", "Mercedes AMG" };

        int index = 0;
        for (Conductor conductor2 : poolConductores) {
            conductor2.setMatricula(matricula[index]);
            conductor2.setModelo(modelos[index]);
            conductor2.setValoracion((byte) 0);
            index++;

        }

        PoolConductores conductores = new PoolConductores(poolConductores);

        for (Conductor conductor2 : conductores.getPoolConductores()) {

            System.out.println(conductor2.getNombre());
            System.out.println(conductor2.getModelo());
            System.out.println(conductor2.getMatricula());
            System.out.println(conductor2.getValoracion());

        }

    }

}
