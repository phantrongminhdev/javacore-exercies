package model1;

public class Engineer extends Person {
	private String major;

	public Engineer() {

	}

	public Engineer(String fullname, int age, String gender, String address, String major) {
		super(fullname, age, gender, address);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Engineer [major=" + major + ", getFullname=" + getFullname() + ", getAge=" + getAge() + ", getGender="
				+ getGender() + ", getAddress=" + getAddress() + ", getClass=" + getClass() + "]";
	}

}
