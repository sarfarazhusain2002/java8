package com.cog.java8.lambda;

/**
 * <b>MathOperations</b> Functional interface introduced in JAVA 8 which
 * contains simple add, default and static methods.
 * 
 * @author Sarfaraz
 *
 */
@FunctionalInterface
public interface MathOperations {

	int add(int a, int b);

	default void printDefault() {
		System.out.println("This is 'default' method implementation");
	}

	static void printStatic() {
		System.out.println("This is 'static' method implementation");
	}
}
