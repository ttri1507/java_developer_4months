package thucHanh;

import java.math.BigDecimal;
import java.util.Arrays;

public class Vd5 {
	public static void main(String[] args) {
		int[]  a = {1,5,3,4,2};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		double[] b = {1.5, 3.2, 4.6, 2.3, 5.8};
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		String[] c = {"mot","bon","tam","hai"};	//bon hai mot tam 
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));

		Integer[]  m = {1,5,3,4,2};
		System.out.println(Arrays.toString(m));
	}
}
