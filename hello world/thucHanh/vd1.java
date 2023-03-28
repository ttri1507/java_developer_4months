package Mang;

import java.util.Arrays;
import java.util.Random;

public class vd1 {

	private static long[] mangAm(long[] a) {
		long[] r = new long[0];
		for(int i =0; i<a.length;i++)
			if(a[i]<0) {
				r = Arrays.copyOf(r, r.length +1);
				r[r.length -1] = a[i];
			}
		return r;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// Vi du 1: Tao 1 mang
			int[] a;
			a = new int[3];
			a[0] = 1;
			a[1] = 2;
			a[2] = 3;
			System.out.println(String.format("%d %d %d",a[0],a[1],a[2]));
			
			// Vi du 2 tao 1 mang duyet phan tu
			
			long[] b = new long[20];
			Random rd = new Random();
			for(int i=0 ; i <b.length;i++)
			{// b[i] = rd.nextLong(21); //cac so ngau nghien tu 0 -20
				b[i] = rd.nextLong(41) -20;
				System.out.print(b[i] + " ");
			}
			
			System.out.println();
			System.out.println(Arrays.toString(b));
			
			long[] c = mangAm(b);
			System.out.println(Arrays.toString(c));
			
	}

}
