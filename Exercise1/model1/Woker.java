package model1;

public class Woker extends Person {

	private int level;

	public Woker(String fullname, int age, String gender, String address, int level) {
		super(fullname, age, gender, address);
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Woker [level=" + level + ", getFullname=" + getFullname() + ", getAge=" + getAge() + ", getGender="
				+ getGender() + ", getAddress=" + getAddress() + "]";
	}
}
