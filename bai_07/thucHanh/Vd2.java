package thucHanh;

import java.util.Date;
import java.util.HashSet;

public class Vd2 {

	public static void main(String[] args) {
		HashSet ds = new HashSet<>();
		ds.add(1);
		ds.add("abc");
		ds.add(new Date());
		ds.add(true);
		ds.add(5.5);
		ds.add("abc");
		System.out.println("Danh sach Set");
		for(Object ob:ds)
			System.out.println(ob.toString());
	}

}
