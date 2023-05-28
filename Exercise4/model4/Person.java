package model4;

public class Person {
	private String fullname;
	private int age;
	private String job;
	private int idNumber;

	public Person() {

	}

	public Person(String fullname, int age, String job, int idNumber) {
		this.fullname = fullname;
		this.age = age;
		this.job = job;
		this.idNumber = idNumber;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	@Override
	public String toString() {
		return "[fullname=" + fullname + ", age=" + age + ", job=" + job + ", idNumber=" + idNumber + "]";
	}
}
