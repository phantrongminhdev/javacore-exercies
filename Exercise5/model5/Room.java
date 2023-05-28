package model5;

public class Room {
	private String typeRoom;
	private int price;
	
	public Room() {
		
	}
	
	public Room(String typeRoom , int price) {
		this.typeRoom = typeRoom;
		this.price = price;
	}

	public String getTypeRoom() {
		return typeRoom;
	}

	public void setTypeRoom(String typeRoom) {
		this.typeRoom = typeRoom;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
