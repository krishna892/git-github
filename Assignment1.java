package com.edureka.module2;

class Multiplication {

	static int multiply(int a, int b)
	{
		return a*b
	}  
}

class Multiplication_float extends Multiplication {

	static float multiply(float a, float b)
	{
		return a*b;
	}  

}

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multiplication_float obj = new Multiplication_float();
		System.out.println(obj.multiply(12.7f, 23.45f));
		System.out.println(obj.multiply(1234, 2345));
	}

}
