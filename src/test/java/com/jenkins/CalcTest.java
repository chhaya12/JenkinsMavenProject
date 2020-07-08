package com.jenkins;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {
	@Test
	public void addTest() {
		Calculator myCalc = new Calculator();
		Assert.assertEquals(10, myCalc.addNumbers(5, 5));
	}

	@Test
	public void subtractTest() {
		Calculator myCalc = new Calculator();
		Assert
		.assertEquals(5, myCalc.subtractNumbers(10, 5));
	}
}