package com.fssa.learnJava.coreJava.day06.practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Inba");
		list.add("Inba");
		list.add("Lokesh");
		list.add("Lokesh");
		list.add("Inba");
		list.add("Inba");
		
		List<String> original = new ArrayList<String>();
		
		for (String name : list) {
			if (!original.contains(name)) {
				original.add(name);
			}
		}
		
		for (String newName : original) {
			System.out.println(newName);
		}
	}

}
