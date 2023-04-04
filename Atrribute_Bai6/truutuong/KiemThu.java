package truutuong;

public class KiemThu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhHoc[] mh = new HinhHoc[3];
		mh [0] = new HT(6);
		mh [1] = new HCN (8,5);
		mh [2] = new HV (4);
		
		for(HinhHoc h:mh) {
			System.out.println(String.format("%s - Chu vi %.2f - Dien Tich %.2f", h.tenHinh(), h.chuVi(),h.dienTich()));
		}

	}

}
