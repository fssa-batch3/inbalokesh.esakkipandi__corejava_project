package com.fssa.learnJava.coreJava.day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Task {
	
	private int id;
	private String name;
	private LocalDate deadline;
	
	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	@Override
	public String toString() {
		return id + "," + name + "," + deadline;
	}
	
	public Task(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}

}

class CompareDate implements Comparator<Task>{
	
	@Override
	public int compare(Task date1, Task date2) {
		return date1.getDeadline().compareTo(date2.getDeadline());
	}
	
}


public class TaskList {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.of(2022, 10, 22);
		LocalDate date2 = LocalDate.of(2022, 10, 01);
		LocalDate date3 = LocalDate.of(2022, 10, 07);

		Task task1 = new Task(3, "Coding", date1);
		Task task2 = new Task(5, "Product Design", date2);
		Task task3 = new Task(1, "Software Design", date3);
		Task task4 = new Task(3, "Coding", date1);
		
		List<Task> taskDetails = new ArrayList<Task>();
		taskDetails.add(task1);
		taskDetails.add(task2);
		taskDetails.add(task3);
		taskDetails.add(task4);
		
		Collections.sort(taskDetails, new CompareDate());
		
//		for (Task t : taskDetails) {
//			System.out.println(t);
//		}
		taskDetails.stream().forEach(tasks -> System.out.println(tasks));
		 
		
	}

}
