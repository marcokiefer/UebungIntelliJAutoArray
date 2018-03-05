package de.gbsschulen.parkplatz;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParkplatzTest {
    private Parkplatz testparkplatz;

    @Test
    public void konstruktorTest(){
        testparkplatz = new Parkplatz();
        assertNotNull(testparkplatz);
        assertNotNull(testparkplatz.parkplatz);
        assertEquals(0, testparkplatz.anzahlAutos);
    }

    @Test
    public void parkenTest() {
        testparkplatz = new Parkplatz();
        Auto auto = new Auto("WM-MK-886", 201);
        boolean result = testparkplatz.parken(auto);
        assertEquals(1, testparkplatz.anzahlAutos);
        assertNotNull(testparkplatz.parkplatz[0]);
        assertEquals(auto, testparkplatz.parkplatz[0]);
        assertTrue(result);
    }

    @Test
    public void whenNoCarIsParkedThenResultIsNull(){
        testparkplatz = new Parkplatz();
        assertNull(testparkplatz.wegfahren());
        assertEquals(0, testparkplatz.anzahlAutos);
    }

    @Test
    public void whenOneOrMoreCarsAreParkedThenResultIsAuto() {
        testparkplatz = new Parkplatz();
        Auto auto = new Auto("WM-MK-886", 201);
        Auto auto1 = new Auto("M-MK-83", 95);
        Auto auto2 = new Auto("LL-B-774", 70);
        testparkplatz.parken(auto);
        testparkplatz.parken(auto1);
        testparkplatz.parken(auto2);
        Auto weggefahreneAuto = testparkplatz.wegfahren();
        assertEquals(auto, weggefahreneAuto);
        assertEquals(2, testparkplatz.anzahlAutos);
        assertEquals(auto1, testparkplatz.parkplatz[0]);
    }



}