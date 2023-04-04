package thucHanh;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HocSinh extends Nguoi {
	private String tr;
	private String lp;
	public HocSinh(String string, Date date, boolean b, String tr, String lp) {
		super();
	}

	public HocSinh(String tr, String lp) {
	super();
	this.tr = tr;
	this.lp = lp;
}
	public String getTr() {
		return tr;
	}
	public void setTr(String tr) {
		this.tr = tr;
	}
	public String getLp() {
		return lp;
	}
	public void setLp(String lp) {
		this.lp = lp;
	}

	
	public String xuat() {
		//SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return String.format("%s - %s -  %s", super.xuat(), tr, lp);
	}

	@Override
	public String toString() {
		return xuat();
	}
	
	
	
	
}
