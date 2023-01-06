package hu.crs;

import org.example.CalculatorController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorControllerIntTest {
    @Test
    public void test() {
        Assertions.assertEquals(1, CalculatorController.sum("One", "Two"));
    }
}