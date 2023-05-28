package model3;

public class BlockC extends Block{
	private final String VAN = "Van";
	private final String SU = "Su";
	private final String DIA= "Dia";
	
	public BlockC() {
		
	}
	
	public BlockC(int idNumber, String nameStudent, String address, String priority) {
		super(idNumber , nameStudent , address , priority);
	}

	public String getVAN() {
		return VAN;
	}

	public String getSu() {
		return SU;
	}

	public String getDia() {
		return DIA;
	}
	
	@Override
	public String toString() {
		return "BlockC [" + VAN + " , " + SU + " , " + DIA + " + IdNumber() =" + getIdNumber()
				+ ", NameStudent=" + getNameStudent() + ", Address=" + getAddress() + ", Priority=" + getPriority()
				+ ", Class=" + getClass() + "]";
	}
}
