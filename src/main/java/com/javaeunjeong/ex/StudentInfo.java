package com.javaeunjeong.ex;

public class StudentInfo {
	
	
	private Student student;//필드
	

	public StudentInfo(Student student) {
		super();
		this.student = student;
	}


	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}



	public void getStudentInfoPrint() {
		System.out.println("이름: " + student.getName());
		System.out.println("나이: " + student.getAge());
		System.out.println("학년: " + student.getGrade());
		System.out.println("반: " + student.getGroup());
		
	}
	
	

}
