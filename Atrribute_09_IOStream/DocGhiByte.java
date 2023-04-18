package thuchanh;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

public class Vd1 {

	public static void main(String[] args) throws IOException {
		// Step 1: Open file (I/O)
		FileInputStream fis = new FileInputStream("src/contact/aman.jpg");
		FileOutputStream fos = new FileOutputStream("nam_sinh.jpg");

		//Step 2: Read
		System.out.println("Dang doc ghi tap tin...");
		int b;
		while((b = fis.read()) != -1 )
			fos.write(b);
		
		//Step 3: Close
		fis.close();
		fos.close();
		System.out.println("Da ghi xong tap tin");
	}

}
