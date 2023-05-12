package com.masai.q3;

public class SchoolStudent extends Student{
	
	String boardName;
	public SchoolStudent(int rollno, String name, String state,String boardName) {
		super(rollno, name, state);
		this.boardName = boardName;
		// TODO Auto-generated constructor stub
		
		
	}
	
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	@Override
	public String toString() {
		return "SchoolStudent [boardName=" + boardName + ", rollno=" + rollno + ", name=" + name + ", state=" + state
				+ "]";
	}
	
}
