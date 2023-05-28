package model12;

public class XeMay extends PhuongTien {
	private String congSuat;

	public XeMay(int id, String hangSanXuat, int namSanXuat, double giaBan, String mauXe, String congSuat) {
		super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
		this.congSuat = congSuat;
	}

	public String getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(String congSuat) {
		this.congSuat = congSuat;
	}

	@Override
	public String toString() {
		return "XeMay [congSuat=" + congSuat + ", getId()=" + getId() + ", getHangSanXuat=" + getHangSanXuat()
				+ ", getNamSanXuat=" + getNamSanXuat() + ", getGiaBan=" + getGiaBan() + ", getMauXe=" + getMauXe()
				+ "]";
	}

}
