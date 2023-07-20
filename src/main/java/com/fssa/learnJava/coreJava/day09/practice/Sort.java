package com.fssa.learnJava.coreJava.day09.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		num.add(8);
		num.add(9);
		num.add(45);
		num.add(12);
		num.add(1);
		
		Collections.sort(num);
		
		System.out.println(num);
		
		
	}

}
