package com.fssa.learnJava.coreJava.day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Task1 {
	
	private int id;
	private String name;
	private LocalDate deadline;
	private int priority;
	
	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	@Override
	public String toString() {
		return id + "," + priority + "," + name + "," + deadline;
	}
	
	public Task1(int id, String name, LocalDate deadline, int priority) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
		this.priority = priority;
	}

}

class TaskPriorityComparator implements Comparator<Task1> {
    @Override
    public int compare(Task1 task1, Task1 task2) {
        return Comparator.comparing(Task1::getDeadline)
                         .thenComparingInt(Task1::getPriority)
                         .compare(task1, task2);
    }
}


public class PriorityTask {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.of(2022, 10, 22);
		LocalDate date2 = LocalDate.of(2022, 10, 01);
		LocalDate date3 = LocalDate.of(2022, 10, 07);

		Task1 task1 = new Task1(1, "Coding", date1, 2);
		Task1 task2 = new Task1(5, "Product Design", date2, 1);
		Task1 task3 = new Task1(2, "Software Design", date3, 3);
		Task1 task4 = new Task1(4, "Coding", date1, 1);
		
		List<Task1> taskDetails1 = new ArrayList<Task1>();
		taskDetails1.add(task1);
		taskDetails1.add(task2);
		taskDetails1.add(task3);
		taskDetails1.add(task4);
		
		Collections.sort(taskDetails1, new TaskPriorityComparator());
		
		for(Task1 p : taskDetails1) {
			System.out.println(p);
		}

	}

}
