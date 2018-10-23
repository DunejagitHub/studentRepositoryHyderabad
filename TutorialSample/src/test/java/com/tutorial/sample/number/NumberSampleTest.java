/**
 * 
 */
package com.tutorial.sample.number;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Admin
 *
 */
public class NumberSampleTest {
	
	
	NumberSample numSample;
	
	
	@Before 
	public void initiateReferences() {
		numSample = new NumberSample();
	}
	
	@Test
	public void greaterNumberTest(){
		int expected = 10;
		int actual;
		
		int firstNumber= 10;
		int secondNumber = 5;
		
		
		actual = numSample.getGreaterNumber(firstNumber,secondNumber);
		assertEquals(expected,actual);
	}
	
	@Test
	public void greaterNumberTest_secondNumber(){
		int expected = 20;
		int actual;
		
		int firstNumber= 10;
		int secondNumber = 20;
		
		
		actual = numSample.getGreaterNumber(firstNumber,secondNumber);
		assertEquals(expected,actual);
	}
	
	@Test
	public void greaterNumberTest_NegativeNumberTest(){
		int expected = 10;
		int actual;
		
		int firstNumber= 10;
		int secondNumber = -20;
		
		
		actual = numSample.getGreaterNumber(firstNumber,secondNumber);
		assertEquals(expected,actual);
	}
	
	@Test
	public void greaterNumberTest_BothNegativeNumberTest(){
		int expected = -10;
		int actual;
		
		int firstNumber= -10;
		int secondNumber = -20;
		
		
		actual = numSample.getGreaterNumber(firstNumber,secondNumber);
		assertEquals(expected,actual);
	}
	

}
