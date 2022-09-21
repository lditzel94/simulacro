package org.simulacro;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private List<Charge> charges = new ArrayList<>();

    public void add( Charge charge ) {
        charges.add( charge );
    }

    public void print() {
        for ( var charge : charges ) {
            System.out.println( charge.name );
            System.out.println( charge.description );
        }
    }
}
