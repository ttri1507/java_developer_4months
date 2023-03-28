package Mang;

public class vd2 {
	
	// Kiem tra nam Nhuan/khong nhuan
	private static boolean namNhuan(int n) {
		if(n % 400 == 0 || (n % 4 == 0 && n % 100 != 0))
			return true;
		else
			return false;
	
	}
	
	private static int soNgayCuaThang(int t, int n) {
		//               toan tu 3 ngoi 
		int[] snt =  {31, namNhuan(n)?29:28, 31,30,31,30,31,31,30,31,30,31};
		return snt[t-1];
		
	}

	public static void main(String[] args) {
		String[] cs = {"khong","một","hai","ba","bốn","năm","sáu","bảy","tám","chín"};
		System.out.println("Chu so cua 3 la: " + cs[3]);
		System.out.println("So ngay cua thang 2 nam 2020 la: " + soNgayCuaThang(2,2023));
	}
}
