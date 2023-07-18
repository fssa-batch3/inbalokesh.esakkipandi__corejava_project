package com.fssa.learnJava.coreJava.day06.practice;

import java.util.ArrayList;

public class App {

	public static boolean findTaskByName(String name, ArrayList<Task> tasks) {
		for (Task task : tasks) {
			if (task.getTaskName().equals(name)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		ArrayList<Task> tasks = new ArrayList<>();
		tasks.add(new Task("Eating", 1));
		tasks.add(new Task("Exercise", 2));
		tasks.add(new Task("Studying", 3));

		boolean exists = findTaskByName("Running", tasks);
		System.out.println("Task Status: " + exists);

	}

}
