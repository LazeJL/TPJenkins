package test.java;


import main.java.org.tpJenkins.exercice3.Delivery;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.MethodSource;

import static org.testng.AssertJUnit.assertEquals;

public class DeliveryTest {

    @MethodSource("delivery.Delivery")
    @Test
    public void testGetPrixLivraison() {
        Delivery delivery = new Delivery();
        delivery.delivery(5, 25);
        double actualPrix = delivery.getPrixLivraison();
        assertEquals(10.0, actualPrix);
    }
}
