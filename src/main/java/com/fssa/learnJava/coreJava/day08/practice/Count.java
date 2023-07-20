package com.fssa.learnJava.coreJava.day08.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Count {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String names = sc.nextLine();

		String[] arr = names.split(",");
		Arrays.sort(arr);

		HashMap<String, Integer> input = new HashMap<String, Integer>();

		for (String name : arr) {
			input.put(name, input.getOrDefault(name, 0) + 1);
		}

		for (String name : input.keySet()) {
            int count = input.get(name);
            System.out.println(name + " : " + count);
        }
	}

}
