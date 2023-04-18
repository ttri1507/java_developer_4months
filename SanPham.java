package thuchanh;

import java.io.Serializable;

public class SanPham implements Serializable {
	String TenSP;
	int SoLuong;
	double DonGia;
	public SanPham(String tenSP, int soLuong, double donGia) {
		super();
		TenSP = tenSP;
		SoLuong = soLuong;
		DonGia = donGia;
	}
	public SanPham() {
		super();
		//TODO Auto-generated constructor stub
	}

	public String getTenSP() {
		return TenSP;
	}
	public void setTenSP(String tenSP) {
		TenSP = tenSP;
	}
	public int getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	public double getDonGia() {
		return DonGia;
	}
	public void setDonGia(double donGia) {
		DonGia = donGia;
	}
	
	
	
	
}
