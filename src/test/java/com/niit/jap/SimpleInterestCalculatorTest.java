package com.niit.jap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SimpleInterestCalculatorTest {

    private SimpleInterestCalculator simpleInterestCalculator;

    @BeforeEach
    void setUp() {
        simpleInterestCalculator = new SimpleInterestCalculator();
    }

    @ParameterizedTest(name = "calculateSimpleInterest({arguments})")
    @CsvSource(value = {"10000.0f,10.0f,1.0f", "100000.0f,12.8f,10.5f", "1000.0f,0.5f,0.6f", "12987.5f,14.5f,8.9f"})
    void calculateSimpleInterest(float principle, float rate, float time) {
        float calculatedSimpleInterest = simpleInterestCalculator.calculateSimpleInterest(principle, rate, time);
        Assertions.assertEquals(
                (principle * rate * time) / 100.0f,
                calculatedSimpleInterest,
                0.1f,
                "The calculated simple interest is not correct!"
        );
    }
}