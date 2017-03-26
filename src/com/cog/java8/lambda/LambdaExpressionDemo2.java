package com.cog.java8.lambda;

/**
 * <b>LambdaExpressionDemo2</b> This class have a simple Lambda expression
 * examples.
 * <ul>
 * <li><b>EXAMPLE 1 :</b> Example to add two integers without Lambda Expression.
 * </li>
 * <li><b>EXAMPLE 2 :</b> Example to add two strings without Lambda Expression.</li>
 * <li><b>EXAMPLE 3 :</b> Example to add two integers with Lambda
 * Expression.</b>.</li>
 * <li><b>EXAMPLE 4 :</b> Example to add two strings with Lambda Expression.</li>
 * </ul>
 * 
 * @author Sarfaraz
 *
 */
public class LambdaExpressionDemo2 {

	public static void main(String[] args) {

		// //////// EXAMPLE 1 //////////
		final AddOperation<Integer, Integer> addOperationInteger = new AddOperation<Integer, Integer>() {
			@Override
			public Integer add(Integer t, Integer u) {
				return t.intValue() + u.intValue();
			}
		};

		System.out.println("WIHOUT LAMBDA :" + addOperationInteger.add(3, 4));
		// ////////EXAMPLE 1 END //////////

		
		
		// //////// EXAMPLE 2 //////////
		final AddOperation<String, String> addOperationString = new AddOperation<String, String>() {
			@Override
			public String add(String t, String u) {
				return t + " " + u;
			}
		};

		System.out.println("WIHOUT LAMBDA :"
				+ addOperationString.add("Sarfaraz", "Husain"));
		// ////////EXAMPLE 2 END //////////

		
		
		// //////// EXAMPLE 3 //////////
		final AddOperation<Integer, Integer> addOperationIntegerLambda = (t, u) -> t
				.intValue() + u.intValue();
		System.out.println("USING LAMBDA :"
				+ addOperationIntegerLambda.add(3, 4));
		// ////////EXAMPLE 3 END //////////
		
		
		
		
		// //////// EXAMPLE 4 //////////
		final AddOperation<String, String> addOperationStringLambda = (t, u) -> t
				+ " " + u;
		System.out.println("USING LAMBDA :"
				+ addOperationStringLambda.add("Sarfaraz", "Husain"));

		// ////////EXAMPLE 4 END //////////
	}

}
