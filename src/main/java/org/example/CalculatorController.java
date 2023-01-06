package org.example;

import java.util.Map;

public class CalculatorController {
    public static int sum(String a, String b) {
        var supportedNumbers = Map.of("One", 1, "Two", 2, "Three", 3);
        if (!supportedNumbers.containsKey(a) || !supportedNumbers.containsKey(b))
            throw new IllegalArgumentException("Unsupported number!");

        return Calculator.sum(supportedNumbers.get(a), supportedNumbers.get(b));
    }
}
