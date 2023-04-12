package thucHanh;

import java.util.Hashtable;
import java.util.TreeMap;

public class Vd3 {

	public static void main(String[] args) {
		Hashtable td = new Hashtable();
		td.put("one", "mot");
		td.put("two", "hai");
		td.put("three", "ba");
		for(Object k:td.keySet())
			System.out.println(k + " -> " + td.get(k));
	}

}
