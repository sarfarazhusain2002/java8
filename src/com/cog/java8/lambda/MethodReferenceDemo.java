package com.cog.java8.lambda;

import java.util.function.BinaryOperator;

/**
 * <b>MethodReferenceDemo</b> This class have a simple Lambda expression
 * examples.
 * <ul>
 * <li><b>EXAMPLE 1 :</b> Sum of two Integers using <b>BinaryOperator</b> class.</li>
 * <li><b>EXAMPLE 2 :</b> Sum of two Integers using <b>BinaryOperator</b> class and without specifying types.</li>
 * <li><b>EXAMPLE 3 :</b> Sum of two Integers using <b>BinaryOperator</b> class and sum method of Integer class.</li>
 * <li><b>EXAMPLE 4 :</b> Sum of two Integers using <b>BinaryOperator</b> class and sum method of Integer class using Method Reference.</li>
 * <li><b>EXAMPLE 5 :</b> Max of two Integers using <b>BinaryOperator</b> class and max method of Integer class.</li>
 * <li><b>EXAMPLE 6 :</b> Max of two Integers using <b>BinaryOperator</b> class and max method of Integer class using Method Reference.</li>
 * </ul>
 * 
 * @author Sarfaraz
 *
 */
public class MethodReferenceDemo {

	public static void main(String[] args) {

		///////// EXAMPLE 1 //////////////
		BinaryOperator<Integer> sum = (Integer a, Integer b) -> a + b;
		System.out.println(sum.apply(10, 15));
		///////// EXAMPLE 1 END //////////////
		
		
		///////// EXAMPLE 2 //////////////
		BinaryOperator<Integer> sum2 = (a, b) -> a + b;
		System.out.println(sum2.apply(15, 15));
		///////// EXAMPLE 2 END //////////////
		
		
		///////// EXAMPLE 3 //////////////
		BinaryOperator<Integer> sum3 = (a, b) -> Integer.sum(a, b);
		System.out.println(sum3.apply(20, 15));
		///////// EXAMPLE 3 END //////////////
		
		
		///////// EXAMPLE 4 //////////////
		BinaryOperator<Integer> sumMethodReference = Integer::sum;
		System.out.println(sumMethodReference.apply(25, 15));
		///////// EXAMPLE 4 END //////////////
		
		
		///////// EXAMPLE 5 //////////////
		BinaryOperator<Integer> max = (a, b) -> Integer.max(a, b);
		System.out.println(max.apply(25, 15));
		///////// EXAMPLE 5 END //////////////
		
		
		///////// EXAMPLE 6 //////////////
		BinaryOperator<Integer> maxMethodReference = Integer::max;
		System.out.println(maxMethodReference.apply(25, 15));
		///////// EXAMPLE 6 END //////////////
		
	}

}
