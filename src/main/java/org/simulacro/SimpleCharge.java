package org.simulacro;

public class SimpleCharge extends Charge {
    private int weight;
    private boolean needsFreezing;

    public int getWeight() {
        return weight;
    }

    public void setWeight( int weight ) {
        this.weight = weight;
    }

    public boolean isNeedsFreezing() {
        return needsFreezing;
    }

    public void setNeedsFreezing( boolean needsFreezing ) {
        this.needsFreezing = needsFreezing;
    }
}
