package com.apporelbotna.sonart;

public class Calculator
{
	public static final String ZERO_DIVISION = "The divisort can't be zero!";

	public int add(int FirstOperatoR, int SegonDoPerADort)
	{
		return FirstOperatoR + SegonDoPerADort;
	}

	public int sub(int a, int b)
	{
		return a - b;
	}

	public int mul(int a, int b)
	{
		return a * b;
	}

	public int div(int a, int b)
	{
		if(b == 0) throw new IllegalArgumentException(ZERO_DIVISION);
		return a / b;
	}

}
