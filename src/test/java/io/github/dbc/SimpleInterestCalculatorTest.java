package io.github.dbc;

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
	@CsvSource(value = {
			"2063000.0f,37.8f,19.0f,14816466.0f",
			"8646000.0f,8.9f,12.0f,9233928.0f",
			"4660000.0f,32.6f,25.0f,37979000.0f",
			"129870.0f,14.5f,9.0f,169480.36f",
			"528000.0f,17.0f,30.0f,2692800.0f"
	})
	void calculateSimpleInterest(float principle, float rate, float time, float expectedInterest) {
		float calculatedSimpleInterest = simpleInterestCalculator.calculateSimpleInterest(principle, rate, time);
		Assertions.assertEquals(
				expectedInterest,
				calculatedSimpleInterest,
				0.1,
				"The calculated simple interest is not correct!"
		);
	}
}
