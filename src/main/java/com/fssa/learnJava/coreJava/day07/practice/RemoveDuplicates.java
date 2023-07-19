package com.fssa.learnJava.coreJava.day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(8);
		numbers.add(1);
		numbers.add(2);
		numbers.add(1);

		HashSet<Integer> numberSet = new HashSet<>();
		for (Integer num : numbers) {
			if (!numberSet.contains(num)) {
				numberSet.add(num);
			}
		}
		
		for(Integer numSet : numberSet) {
			System.out.println(numSet);
		}
	}

}
