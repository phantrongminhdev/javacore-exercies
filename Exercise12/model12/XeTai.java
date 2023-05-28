package model12;

public class XeTai extends PhuongTien {
	private String trongTai;

	public XeTai() {

	}

	public XeTai(int id, String hangSanXuat, int namSanXuat, double giaBan, String mauXe, String trongTai) {
		super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
		this.trongTai = trongTai;
	}

	public String getTrongTai() {
		return trongTai;
	}

	public void setTrongTai(String trongTai) {
		this.trongTai = trongTai;
	}

	@Override
	public String toString() {
		return "XeTai [trongTai=" + trongTai + ", Id=" + getId() + ", HangSanXuat=" + getHangSanXuat() + "NamSanXuat="
				+ getNamSanXuat() + ", GiaBan=" + getGiaBan() + ", MauXe=" + getMauXe() + "]";
	}

}
