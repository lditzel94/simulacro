package org.simulacro;

public class ChargeFactory {
    private static ChargeFactory instance;

    private ChargeFactory() {
    }

    public static ChargeFactory getInstance() {
        if ( instance == null ) {
            return new ChargeFactory();
        }
        return instance;
    }

    public Charge createCharge( String type ) {
        switch ( type ) {
            case "simple":
                return new SimpleCharge();
            case "container":
                new ContainerCharge();
            default:
                return null;
        }
    }
}
