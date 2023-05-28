package model2;

public class Paper extends Document{
	private int day;
	
	public Paper() {
		
	}
	
	public Paper(int id , String namePublisher , int numberPublisher , int day) {
		super(id , namePublisher, numberPublisher);
		this.day = day;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "Paper [day=" + day + ", getId=" + getId() + ", NamePublisher=" + getNamePublisher()
				+ ", NumberPublisher=" + getNumberPublisher() + ", Class=" + getClass()  + "]";
	}
	
	
}
