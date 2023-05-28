package model8;

public class Student {
	private String fullname;
	private int age;
	private String nameClassStudent;

	public Student() {

	}

	public Student(String fullname, int age, String nameClassStudent) {
		this.fullname = fullname;
		this.age = age;
		this.nameClassStudent = nameClassStudent;
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

	public String getNameClassStudent() {
		return nameClassStudent;
	}

	public void setNameClassStudent(String nameClassStudent) {
		this.nameClassStudent = nameClassStudent;
	}

	@Override
	public String toString() {
		return "Student [fullname=" + fullname + ", age=" + age + ", nameClassStudent=" + nameClassStudent + "]";
	}

}
