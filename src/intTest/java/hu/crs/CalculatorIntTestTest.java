package hu.crs;

import org.example.CalculatorController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorControllerIntTest {
    @Test
    public void test() {
        Assertions.assertEquals(3, CalculatorController.sum("One", "Two"));
    }
}