package thuchanh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DocGhiObject {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		SanPham sp1 = new SanPham("May vi tinh",1,50000);
		System.out.println("Ghi Tap Tin");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sanpham.obj"));
		oos.writeObject(sp1);
		oos.close();
		
		System.out.println("Doc tap tin");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sanpham.obj"));
		SanPham sp2 = (SanPham) ois.readObject();
		ois.close();
		
		System.out.println(String.format("%s - %d - %f", sp2.getTenSP(), sp2.getSoLuong(), sp2.getDonGia()));
	}

}
