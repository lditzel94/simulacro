package org.simulacro;

import java.util.Arrays;

public class Main {
    public static void main( String[] args ) {
        ChargeFactory factory = ChargeFactory.getInstance();

        var tv = factory.createCharge( "simple" );
        var medicine = factory.createCharge( "simple" );
        var container = ( ContainerCharge ) factory.createCharge( "container" );

        /*SimpleCharge tv = new SimpleCharge();
        SimpleCharge medicine = new SimpleCharge();
        ContainerCharge container = new ContainerCharge();*/

        tv.setName( "TV" );
        tv.setDescription( "Description TV" );

        medicine.setName( "Medicine" );
        medicine.setDescription( "Description Medicine" );

        container.setName( "Container" );
        container.setDescription( "Description Container" );
        container.setCharges( Arrays.asList( tv, medicine ) );

        Ship ship = new Ship();
        ship.add( tv );
        ship.add( medicine );
        ship.add( container );

        ship.print();
    }
}