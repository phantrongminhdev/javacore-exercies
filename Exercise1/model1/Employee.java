package model1;

public class Employee extends Person {
	private String work;

	public Employee(String fullname, int age, String gender, String address, String work) {
		super(fullname, age, gender, address);
		this.work = work;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return "Employee [work= " + getWork() + ", Fullname=" + getFullname() + ", Age=" + getAge() + ", Gender="
				+ getGender() + ", Address=" + getAddress() + "]";
	}

}
