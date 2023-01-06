package hu.crs;
import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    private void test() {
        Assertions.assertEquals(1, Calculator.sum(3,2));
    }
}
