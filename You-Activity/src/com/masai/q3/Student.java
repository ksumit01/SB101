package com.masai;

import java.util.Objects;

public class Student {

	int rollno;
	String name;
	String state;
	public Student(int rollno, String name, String state) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.state = state;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", name=" + name + ", state=" + state + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, rollno, state);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollno == other.rollno && Objects.equals(state, other.state);
	}
	
	
	
}
