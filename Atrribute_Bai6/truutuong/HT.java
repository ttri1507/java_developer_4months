package truutuong;

public class HT extends HinhHoc {
	private int bk;

	
	public HT() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	

	public HT(int bk) {
		super();
		this.bk = bk;
	}
	
	
	public int getBk() {
		return bk;
	}


	public void setBk(int bk) {
		this.bk = bk;
	}



	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return bk *2 *Math.PI;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return bk + bk * Math.PI;
	}
	
	@Override
	public String tenHinh() {
		return "Hinh tron";
	}
	

}
