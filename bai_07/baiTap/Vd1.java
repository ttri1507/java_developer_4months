package baiTap;

public class Vd1 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "bcd";
		if(s1.compareTo(s2)<0)
			System.out.println(String.format("%s < %s",s1,s2));
		else if(s1.compareTo(s2) == 0)
			System.out.println(String.format("%s == %s",s1,s2));
		else
			System.out.println(String.format("%s > %s",s1,s2));
	}

}
