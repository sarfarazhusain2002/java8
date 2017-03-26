package com.cog.java8.mapFilterReduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceMainDemo2 {
	public static void main(String[] args) {
		
		List<Integer> ints = Arrays.asList(-1,1,2,3,4,5,6,7,8, 9);
		List<Integer> ints1 = Arrays.asList(0,1,2,3,4);
		List<Integer> ints2 = Arrays.asList(-1,-2,-2,-5, -4);
		
		BinaryOperator<Integer> op = (i1, i2) -> Integer.max(i1, i2);
		
		int sum = reduce(ints, 0, op);
		
		int r1 = reduce(ints1, 0, op);
		int r2 = reduce(ints2, 0, op);
		System.out.println("r2 :: " + r2);
		int rM = reduce(Arrays.asList(r1, r2), 0, op);
		
		System.out.println(rM);
		System.out.println("SUM ::"+sum);
		
		Stream<String> s = Stream.generate(() -> "one");
		s.limit(5).forEach(System.out::println);
	}
	
	public static int reduce(List<Integer> values, 
							Integer identity,
							BinaryOperator<Integer> reduction){
		
		int sum = identity;
		for(Integer value : values){
			sum = reduction.apply(sum, value);
		}
		
		return sum;
	}
}
