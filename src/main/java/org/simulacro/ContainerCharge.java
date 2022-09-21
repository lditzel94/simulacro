package org.simulacro;

import java.util.ArrayList;
import java.util.List;

public class ContainerCharge extends Charge {
    private int containerWeight;
    private List<Charge> charges = new ArrayList<>();

    public int getContainerWeight() {
        return containerWeight;
    }

    public void setContainerWeight( int containerWeight ) {
        this.containerWeight = containerWeight;
    }

    public List<Charge> getCharges() {
        return charges;
    }

    public void setCharges( List<Charge> charges ) {
        this.charges = charges;
    }
}
