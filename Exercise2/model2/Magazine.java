package model2;

public class Magazine extends Document {
	private int number;
	private int month;

	public Magazine() {

	}

	public Magazine(int id, String namePublisher, int numberPublisher, int number, int month) {
		super(id, namePublisher, numberPublisher);
		this.number = number;
		this.month = month;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return "Magazine [number=" + number + ", month=" + month + ", Id=" + getId() + ", NamePublisher="
				+ getNamePublisher() + ", NumberPublisher=" + getNumberPublisher() + ", Class=" + getClass() + "]";
	}

}
