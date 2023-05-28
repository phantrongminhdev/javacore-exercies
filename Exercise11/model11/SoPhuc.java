package model11;

import java.util.Scanner;

public class SoPhuc {
	private double phanThuc;
	private double phanAo;
	
	public SoPhuc() {
		
	}
	
	public SoPhuc(double phanThuc , double phanAo) {
		this.phanThuc = phanThuc;
		this.phanAo = phanAo;
	}

	public double getPhanThuc() {
		return phanThuc;
	}

	public void setPhanThuc(double phanThuc) {
		this.phanThuc = phanThuc;
	}

	public double getPhanAo() {
		return phanAo;
	}

	public void setPhanAo(double phanAo) {
		this.phanAo = phanAo;
	}
	
	public void nhapSoPhuc() {
		System.out.println("nhap phan thuc : ");
		this.phanThuc = new Scanner(System.in).nextDouble();
		System.out.println("nhap phan ao : ");
		this.phanAo = new Scanner(System.in).nextDouble();
	}
	
	public void showSoPhuc() {
		System.out.println(this.phanThuc + " + " + this.phanAo + "i");
	}
	
	public void congHaiSoPhuc(SoPhuc a , SoPhuc b) {
		this.phanThuc = a.getPhanThuc() + b.getPhanThuc();
		this.phanAo = b.getPhanAo() + b.getPhanAo();
	}
}














