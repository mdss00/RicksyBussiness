/*package edu.badpals.ricksyBussines;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CrystalExpenderTest {

    private CrystalExpender expender = null;

    @Before
    public void setupExpender() {
        expender = new CrystalExpender(100, 50.0);
        assertNotNull("Expender creado", expender);
    }

    @Test
    public void constructortest() {
        assertNotNull("Expender creado", expender);
        assertEquals(100, expender.stock());
    }

    @Test
    public void dispatchTestOK() {
        CreditCard card = new CreditCard("Abradolf Lincler", "4916119711304546");
        expender.dispatch(card);
        assertEquals(99, expender.stock());
    }

    @Test
    public void dispatchTestNoStock() {
        CreditCard card = new CreditCard("Abradolf Lincler", "4916119711304546");
        expender = new CrystalExpender(0, 50.0);
        expender.dispatch(card);
        assertEquals(0, expender.stock());
        assertEquals(3000, card.credit(), 0);
    }

    @Test
    public void dispatchTestNoCredit() {
        CreditCard card = new CreditCard("Abradolf Lincler", "4916119711304546");
        expender = new CrystalExpender(100, 4000);
        expender.dispatch(card);
        assertEquals(100, expender.stock());
    }
}*/
