package com.javaeunjeong.ex;

public class Student {
	
	private String name;
	private String age;
	private String grade;
	private String group;
	
	
	public Student(String name, String age, String grade, String group) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.group = group;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	
	
	
	
	

}
