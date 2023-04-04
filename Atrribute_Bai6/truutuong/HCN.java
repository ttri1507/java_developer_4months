package truutuong;

public class HCN extends HinhHoc{
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
	
	@Override
	public double chuVi() {
		return ((double)cd +cr)*2;
		
	}
	@Override
	public double dienTich() {
		return ((double)cd*cr);
		
	}
	@Override
	public String tenHinh() {
		return "Hinh Chu Nhat";
	}
	
	public String xuat() {
		return String.format("Chu vi la: %.2f, Dien tich la: %.2f", chuVi(), dienTich());
	}
}
