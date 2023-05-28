package model3;

public class BlockB extends Block{
	private final String TOAN = "Toan";
	private final String HOA = "Hoa";
	private final String SINH= "Sinh";
	
	public BlockB() {
		
	}
	
	public BlockB(int idNumber, String nameStudent, String address, String priority) {
		super(idNumber , nameStudent , address , priority);
	}

	public String getTOAN() {
		return TOAN;
	}

	public String getHOA() {
		return HOA;
	}

	public String getSINH() {
		return SINH;
	}

	@Override
	public String toString() {
		return "BlockB [" + TOAN + " , " + HOA + " , " + SINH + " + IdNumber() =" + getIdNumber()
				+ ", NameStudent=" + getNameStudent() + ", Address=" + getAddress() + ", Priority=" + getPriority()
				+ ", Class=" + getClass() + "]";
	}
}
