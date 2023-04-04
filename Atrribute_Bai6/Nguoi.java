package thucHanh;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Nguoi {
	// du lieu (field)
	private String ht;
	private Date ns;
	private boolean gt;
	
	// khoi tao static (after)
	private static int soNguoi;
	static {
		soNguoi =0;
	}
	
	public static int getSoNguoi() {
		return soNguoi;
		}
	
	
	
	// khoi tao( constructor)

	public Nguoi() {
		super();
		//TODO Auto-generated constructor stub
		soNguoi++; //sau nay them vo
	}
	
	
	public Nguoi(String ht, java.util.Date date, boolean gt) {
		super();
		this.ht = ht;
		this.ns = date;
		this.gt = gt;
	}


	public String getHt() {
		return ht;
	}

	public void setHt(String ht) {
		this.ht = ht;
	}
	public Date getNs() {
		return ns;
	}
	public void setNs(Date ns) {
		this.ns = ns;
	}
	public boolean isGt() {
		return gt;
	}
	public void setGt(boolean gt) {
		this.gt = gt;
	}
	
	public String xuat() {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return String.format("%s - %s -  %s", ht, (ns != null)? df.format(ns):null,gt);
	}

	@Override
	public String toString() {
		return xuat();
	}
	

}
