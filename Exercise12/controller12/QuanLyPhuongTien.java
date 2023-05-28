package controller12;

import java.util.ArrayList;
import java.util.List;

import model12.PhuongTien;

public class QuanLyPhuongTien {
	List<PhuongTien> phuongTiens;
	
	public QuanLyPhuongTien() {
		this.phuongTiens = new ArrayList<>();
	}
	// thêm phương tiện
	public void themPhuongTien(PhuongTien phuongTien) {
		this.phuongTiens.add(phuongTien);
	}
	// xoá phươnng tiện by id
	public void xoaPhuongTienById(int id) {
		for(int i = 0;i< phuongTiens.size();i++) {
			if(phuongTiens.get(i).getId() == id) {
				this.phuongTiens.remove(i);
			}
		}
	}
	// tìm phương tiện theo hãng sản xuất
	public void timPhuongTienByHangSanXuat(String tenHangSanXuat) {
		for(PhuongTien phuongTien : phuongTiens) {
			if(phuongTien.getHangSanXuat().equals(tenHangSanXuat)) {
				phuongTien.toString();
			}
		}
	}
	// tìm phương tiện theo màu
	public void timPhuongTienByMauSac(String mauSac) {
		for(PhuongTien phuongTien : phuongTiens) {
			if(phuongTien.getMauXe().equals(mauSac)) {
				phuongTien.toString();
			}
		}
	}
}










