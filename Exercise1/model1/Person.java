package model1;

import java.util.Scanner;

public class Person {
	private String fullname;
	private int age;
	private String gender;
	private String address;
	
	public Person() {
		
	}
	
	public Person(String fullname , int age , String gender , String address) {
		this.fullname = fullname;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
