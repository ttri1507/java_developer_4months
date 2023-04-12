package thucHanh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vd1 {

	public static void main(String[] args) {
		int[] a = {1,5,3,2,4};
		System.out.println("Them phan tu so 6 vao cuoi mang");
		a = Arrays.copyOf(a, a.length + 1);
		a[a.length-1] = 6;
		System.out.println(Arrays.toString(a));
		System.out.println("Chen vao so 7 vao vi tri so 1 (phan tu so 5)");
		a = Arrays.copyOf(a,a.length+1);
		for(int i=a.length-1; i>1; i--)
			a[i] = a[i-1];
		a[1] = 7;
		System.out.println(Arrays.toString(a));
		
		List l1 = new ArrayList();
		l1.add(1);
		l1.add(5);
		l1.add(3);
		l1.add(2);
		l1.add(4);
		System.out.println(l1);
		l1.add(6);
		System.out.println(l1);
		l1.add(1, 7);
		System.out.println(l1);
		l1.remove(2);
		System.out.println(l1);
	}

}
