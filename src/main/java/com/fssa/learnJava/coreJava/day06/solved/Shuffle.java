package com.fssa.learnJava.coreJava.day06.solved;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Shuffle {
	
	public static void main(String[] args) {
		String[] names = new String[4];
		names[0] = "Inba";
		names[1] = "Lokesh";
		names[2] = "Annapooraini";
		names[3] = "Vijay";
        List<String> list = Arrays.asList(names);     
        Collections.shuffle(list);
        System.out.println(list);
    }

}
