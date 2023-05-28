package model10;

import java.util.Scanner;

public class VanBan {
	private String chuoiKyTu;
	
	public VanBan() {
		
	}
	
	public VanBan(String chuoiKyTu) {
		this.chuoiKyTu = chuoiKyTu;
	}
	
	public int  demSoTuVanBan() {
		int count = 0;
		String[] words = chuoiKyTu.split("\\s");
		for(String w : words) {
			count++;
		}
		return count;
	}
	
	public int demKyTuA() {
		int count = 0;
		for(int i = 0 ; i < chuoiKyTu.length() ; i++) {

			if(chuoiKyTu.charAt(i) == 'a' || chuoiKyTu.charAt(i) == 'A') {
				count++;
			}
		}
		return count;
	}
	
	public void chuanHoaXau(){
		 this.chuoiKyTu = this.chuoiKyTu.trim();
		 this.chuoiKyTu = this.chuoiKyTu.replaceAll("\\s+"," ");
	}
	public static void main(String[] args) {
		System.out.println("enter a string : ");
		String chuoiKyTu = new Scanner(System.in).nextLine();
		VanBan vanBan = new VanBan(chuoiKyTu);
		System.out.println("So tu trong van ban : " + vanBan.demSoTuVanBan());
		System.out.println("So ky tu trong van ban : " + vanBan.demKyTuA());
		System.out.println("Chuan hoa van ban : ");
		vanBan.chuanHoaXau();
	}
}
