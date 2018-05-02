package com.apporelbotna.sonart;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CalculatorTest
{
	private Calculator calculator = new Calculator();

	@Test
	public void addTest() throws Exception
	{
		assertEquals(4, calculator.add(2, 1));
	}

	@Test
	public void subTest() throws Exception
	{
		assertEquals(1, calculator.sub(2, 1));
	}

	@Test
	public void mulTest() throws Exception
	{
		assertEquals(2, calculator.mul(2, 1));
	}

	@Test
	public void divTest() throws Exception
	{
		assertEquals(2, calculator.div(2, 1));
	}

	@Test
	public void divPerZeroShouldThrowExceptionTest() throws Exception
	{
		try
		{
			assertEquals(2, calculator.div(2, 0));
			fail();
		}
		catch(IllegalArgumentException e)
		{
			assertEquals(Calculator.ZERO_DIVISION, e.getMessage());
		}
	}
}
