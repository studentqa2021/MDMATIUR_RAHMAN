package com.testrun;

public class SwapVariablePractice {

	void getSwap(int a, int b) {

		System.out.println("A valu before swap =" + a);
		System.out.println("B valu before swap =" + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("A valu after swap =" + a);
		System.out.println("B valu arter swap =" + b);

		
		}
	
	public static void main(String[] args) {
		
		SwapVariablePractice obj = new SwapVariablePractice();
		obj.getSwap(5, 10);
		
		
	}
	
	
	
}
