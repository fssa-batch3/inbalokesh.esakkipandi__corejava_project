package com.fssa.learnJava.coreJava.day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

class Task {

	private int id;
	private String name;
	private LocalDate deadline;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	@Override
	public String toString() {
		return "Task [id: " + id + ", name: " + name + ", deadline: " + deadline + "]";
	}

	public Task(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Task other = (Task) obj;
		return name.equals(other.name) && deadline.equals(other.deadline);
	}

	@Override
	public int hashCode() {
		return name.hashCode() + deadline.hashCode();
	}

}

public class RemoveDuplicateTask {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.of(2023, 11, 8);
		LocalDate date2 = LocalDate.of(2023, 8, 3);
		LocalDate date3 = LocalDate.of(2023, 7, 29);

		Task task1 = new Task(123, "Study", date3);
		Task task2 = new Task(122, "Buy Cake", date1);
		Task task3 = new Task(121, "Jogging", date2);
		Task task4 = new Task(120, "Study", date3);

		ArrayList<Task> taskDetails = new ArrayList<Task>();
		taskDetails.add(task1);
		taskDetails.add(task2);
		taskDetails.add(task3);
		taskDetails.add(task4);

		System.out.println("ArrayList size: " + taskDetails.size());

		HashSet<Task> setOfTasks = new HashSet<>();

		for (Task t : taskDetails) {
			if (!setOfTasks.contains(t)) {
				setOfTasks.add(t);
			}
		}

		for (Task taskSet : setOfTasks) {
			System.out.println(taskSet);
		}

		System.out.println("HashSet size: " + setOfTasks.size());
	}

}
