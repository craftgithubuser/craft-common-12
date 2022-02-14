package com.truemaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {
Calc C =new Calc();
	@Test
	public void additionTest() {
		assertEquals(7,C.add(5, 2));
		
		
	}

}
