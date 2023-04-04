package thucHanh;

public class HCN {
	private int cd;
	private int cr;
	public HCN() {
		super();
		//TODO Auto-generated constructor stub
	}
	public HCN(int cd, int cr) {
		super();
		this.cd = cd;
		this.cr = cr;
	}
	public int getCd() {
		return cd;
	}
	public void setCd(int cd) {
		this.cd = cd;
	}
	public int getCr() {
		return cr;
	}
	public void setCr(int cr) {
		this.cr = cr;
	}
	
	public double ChuVi() {
		return ((double)cd +cr)*2;
		
	}
	public double DienTich() {
		return ((double)cd*cr);
		
	}
	
	public String tenHinh() {
		return "Hinh Chu Nhat";
	}
	
	public String xuat() {
		return String.format("Chu vi la: %.2f, Dien tich la: %.2f", ChuVi(), DienTich());
	}
}
