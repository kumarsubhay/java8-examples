package com.java8.forEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class StreamForEachExam {

	public static void main(String[] args) {
		
		ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		Consumer<Integer> action = System.out::println;
		 
		numberList.stream().filter(n -> n%2  == 0).forEach( action );
		

		
	}

}
