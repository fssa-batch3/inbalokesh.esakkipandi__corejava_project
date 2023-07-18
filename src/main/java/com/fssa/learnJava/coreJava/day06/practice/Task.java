package com.fssa.learnJava.coreJava.day06.practice;

public class Task {

	public String taskName;
	public int priority;

	public String getTaskName() {
		return taskName;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Task(String taskName, int priority) {
		this.taskName = taskName;
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Task [taskName=" + taskName + ", priority=" + priority + "]";
	}

}
