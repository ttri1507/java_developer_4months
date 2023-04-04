package thucHanh;

import java.util.Date;

public class Kiemthu {

	public static void main(String[] args) {
	
		Nguoi ng1 = new Nguoi();
		System.out.println(ng1.xuat());
		Nguoi ng2 = new Nguoi("Tran Maria Vonga My Trinh", new Date(),true);
		System.out.println(ng2.xuat());
		
//		HocSinh hs1 = new HocSinh();
//		System.out.println(hs1.xuat());
		
		HocSinh hs2 = new HocSinh("Hoang Ngoc Thuy Thuong", new Date(),false,"Hoa Sen University","International Bussiness");
		System.out.println(hs2.xuat());
		
//		HCN h1 = new HCN();
//		System.out.println(h1.tenHinh() +  " -> " + h1.xuat());
//		HCN h2 = new HCN(8,5);
//		System.out.println(h2.tenHinh() +  " -> " + h2.xuat());
//		
//		HV hv1 = new HV();
//		System.out.println(hv1.tenHinh() +  " -> " + hv1.xuat());
//		HV hv2 = new HV(8);
//		System.out.println(hv2.tenHinh() +  " -> " + hv2.xuat());
	}

}
