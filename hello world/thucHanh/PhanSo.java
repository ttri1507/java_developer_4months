package thuchanh;

public class PhanSo {
	// data
	private int ts;
	private int ms;
	
	//phuong thuc
	// khoi tao (constructor)
	public PhanSo() {
		ts =0;
		ms =1;
		
	}
	public PhanSo(int ts, int ms) {
		this.ts = ts;
		this.ms = ms;
	}
	
	// Nhap xuat ( Thuoc tinh property)
	public void setTs( int ts) {
		this.ts = ts;
	}
	public int getTs() {
		return ts;
	}
	
	public void setMs( int ms) {
		this.ms = ms;
	}
	public int getMs() {
		return ms;
	}
	
	//-- Xu ly
	public PhanSo cong(PhanSo p) {
		PhanSo tv = new PhanSo();
		tv.ts = ts * p.ms + p.ts *ms;
		tv.ms = p.ms  * ms;
		return tv;
	}
	
	public PhanSo tru(PhanSo p) {
		PhanSo tv = new PhanSo();
		tv.ts = ts * p.ms - p.ts *ms;
		tv.ms = p.ms  * ms;
		return tv;
	}
	
	public PhanSo nhan(PhanSo p) {
		PhanSo tv = new PhanSo();
		tv.ts = ts *  p.ts ;
		tv.ms = p.ms *ms;
		return tv;
	}
	
	public PhanSo chia(PhanSo p) {
		PhanSo tv = new PhanSo();
		tv.ts = ts * p.ms ;
		tv.ms = p.ts *ms;
		return tv;
	}
	
}
