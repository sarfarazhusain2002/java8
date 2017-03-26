package com.cog.java8.lambda;

/**
 * <b>AddOperation</b> A generic Functional Interface to add two objects value.
 * 
 * @author Sarfaraz
 *
 */
@FunctionalInterface
public interface AddOperation<T, U> {
	T add(T t, U u);
}