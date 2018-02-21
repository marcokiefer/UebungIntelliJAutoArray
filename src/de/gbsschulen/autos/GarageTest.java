package de.gbsschulen.autos;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class GarageTest {
    private Garage garage;
    @Before
    public void vorTestsAusfuehrer(){
        garage = new Garage(3);
    }

    @Test
    public void konstruktorTest(){
        garage = new Garage(3);
        assertNotNull(garage);
    }
    @Test
    public void whenPosIsNegativeThenResultIsFalse(){
        assertFalse(garage.hinzufuegen(new Auto(),-1));
    }
    @Test
    public void whenPosIsMaxAutosOrGreaterThenResultIsFalse(){
        assertFalse(garage.hinzufuegen(new Auto(),3));
    }
    @Test
    public void whenPosIsCorrectThenResultIsTrue(){
        garage = new Garage(3);
        assertTrue(garage.hinzufuegen(new Auto(),0));
        assertEquals(1, garage.anzahlAutos());
    }
    @Test
    public void whenMoreThenMaxAnzahlAutosAddedThenResultIsFalse(){
        garage = new Garage(1);
        garage.hinzufuegen(new Auto(),0);
        assertFalse(garage.hinzufuegen(new Auto(),1));
    }


}