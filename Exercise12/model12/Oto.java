package model12;

public class Oto extends PhuongTien{
	private int soChoNgoi;
	private String kieuDongCo;
	
	public Oto() {
		
	}
	
	public Oto(int id , String hangSanXuat , int namSanXuat , double giaBan , String mauXe , int soChoNgoi , String kieuDongCo) {
		super(id , hangSanXuat , namSanXuat , giaBan , mauXe );
		this.soChoNgoi = soChoNgoi;
		this.kieuDongCo = kieuDongCo;
	}

	public int getSoChoNgoi() {
		return soChoNgoi;
	}

	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}

	public String getKieuDongCo() {
		return kieuDongCo;
	}

	public void setKieuDongCo(String kieuDongCo) {
		this.kieuDongCo = kieuDongCo;
	}

	@Override
	public String toString() {
		return "Oto [soChoNgoi=" + soChoNgoi + ", kieuDongCo=" + kieuDongCo + ", Id=" + getId()
				+ "HangSanXuat=" + getHangSanXuat() + "NamSanXuat=" + getNamSanXuat() + "GiaBan="
				+ getGiaBan() + ", getMauXe=" + getMauXe() + "]";
	}
	
	
}
