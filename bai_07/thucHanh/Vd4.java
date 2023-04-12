package thucHanh;

import java.util.Map;
import java.util.TreeMap;

public class Vd4 {

	public static void main(String[] args) {
		Map<Integer, String> td = new TreeMap<>();
		td.put(1, "mot");
		td.put(5, "nam");
		td.put(4, "bon");
		td.put(3, "ba");
		for(int k:td.keySet())
			System.out.println(k + " -> " + td.get(k));
	}

}
