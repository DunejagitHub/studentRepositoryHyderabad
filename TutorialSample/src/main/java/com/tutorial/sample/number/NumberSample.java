/**
 * 
 */
package com.tutorial.sample.number;

/**
 * @author Admin
 *
 */
public class NumberSample {

	public int getGreaterNumber(int firstNumber, int secondNumber) {
		
		if (firstNumber > secondNumber){
			
			return firstNumber;
			
		}else if (firstNumber < secondNumber) {
			
			return secondNumber;
		}else {
			System.out.println("insiode greater number method");
			return firstNumber;
		}
				
	}

}
