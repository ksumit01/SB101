package com.masai;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void findStudentWithSameState(List< Student> st, List<? extends Student> student2,
			List<? extends Student> student1, String state) {

		List<Student> sameStateStudents = new ArrayList<>();

		for (Student s : student1) {
			if (s.getState().equals(state)) {
				sameStateStudents.add(s);
			}
		}

		for (Student s : student2) {
			if (s.getState().equals(state)) {
				sameStateStudents.add(s);
			}
		}

		st.addAll(sameStateStudents);
		System.out.println(st);

	}

	public static void main(String[] args) {
		List<SchoolStudent> ss = new ArrayList<>();
		List<CollegeStudent> cs = new ArrayList<>();
		List<Student> st = new ArrayList<>();

		ss.add(new SchoolStudent(1, "raju", "bihar", "bses"));
		ss.add(new SchoolStudent(2, "raj", "biha", "bse"));
		ss.add(new SchoolStudent(3, "ra", "bih", "bs"));
		ss.add(new SchoolStudent(4, "r", "bihar", "b"));
		ss.add(new SchoolStudent(5, "raju1", "bihar1", "bses1"));

		cs.add(new CollegeStudent(5, "sumit", "bihar", "Srm"));
		cs.add(new CollegeStudent(6, "sumi", "biha", "Srm1"));
		cs.add(new CollegeStudent(7, "sum", "bih", "Srm2"));
		cs.add(new CollegeStudent(8, "su", "bi", "Srm3"));
		cs.add(new CollegeStudent(9, "s", "bihar", "Srm4"));

		findStudentWithSameState(st, cs, ss, "bihar");

	}
}
