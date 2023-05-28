package model3;

public class BlockA extends Block {
	private final String TOAN = "Toan";
	private final String LY = "Ly";
	private final String HOA = "Hoa";

	public BlockA() {

	}

	public BlockA(int idNumber, String nameStudent, String address, String priority) {
		super(idNumber, nameStudent, address, priority);
	}

	public String getTOAN() {
		return TOAN;
	}

	public String getLY() {
		return LY;
	}

	public String getHOA() {
		return HOA;
	}

	@Override
	public String toString() {
		return "BlockA [" + TOAN + " , " + LY + " , " + HOA + " + IdNumber() =" + getIdNumber()
				+ ", NameStudent=" + getNameStudent() + ", Address=" + getAddress() + ", Priority=" + getPriority()
				+ ", Class=" + getClass() + "]";
	}

}
