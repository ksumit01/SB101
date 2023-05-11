package com.masai;

public class CollegeStudent extends Student{
	String universityName ;
	public CollegeStudent(int rollno, String name, String state,String universityName) {
		super(rollno, name, state);
		// TODO Auto-generated constructor stub
		this.universityName = universityName;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	@Override
	public String toString() {
		return "CollegeStudent [universityName=" + universityName + ", rollno=" + rollno + ", name=" + name + ", state="
				+ state + "  ]";
	}
	
	
	
}
