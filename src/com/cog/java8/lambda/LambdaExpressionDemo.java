package com.cog.java8.lambda;

/**
 * <b>LambdaExpressionDemo</b> This class have a simple Lambda expression
 * examples.
 * <ul>
 * <li><b>EXAMPLE 1 :</b> Example using JAVA 7 WAY to add two numbers.</li>
 * <li><b>EXAMPLE 2 :</b> Example using JAVA 8 Lambda expression to add two numbers.</li>
 * <li><b>EXAMPLE 3 :</b> Print default method from <b>Functional Interface</b>.</li>
 * <li><b>EXAMPLE 4 :</b> Print static method from <b>Functional Interface</b>.</li>
 * </ul>
 * 
 * @author Sarfaraz
 *
 */
public class LambdaExpressionDemo {

	public static void main(String[] args) {

		///// EXAMPLE 1 //////////////		
		final MathOperations mathOperations = new MathOperations() {
			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};

		System.out.println("JAVA 7 WAY ::" + mathOperations.add(2, 3));
		// //// EXAMPLE 1 END ////////////

		// /// EXAMPLE 2 //////////////
		// final MathOperations mathOperations2 = (int a, int b) -> a + b; //
		// Same as below
		final MathOperations mathOperations3 = (a, b) -> a + b;

		System.out.println("JAVA 8 WAY (Lamba Expression) :"
				+ mathOperations3.add(2, 3));
		// //// EXAMPLE 2 END ////////////

		// //// EXAMPLE 3 ////////////
		mathOperations.printDefault();
		// //// EXAMPLE 3 END ////////////

		// //// EXAMPLE 4 ////////////
		MathOperations.printStatic();
		// //// EXAMPLE 4 END ////////////
	}

}
