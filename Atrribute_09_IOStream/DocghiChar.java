package thuchanh;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 
 Read File							Write file
 FileInputStream ->> byte        	FileOutputStream
 FileReader ->> Char				FileWriter
 Scanner ->> ASCII					PrintWriter
 DataInputStream (Type)				DataOutputStream
 Object Input Stream (Object)		ObjectOutputStream
  

 
 */

public class DocghiChar {

	public static void main(String[] args) {
		String s = "Trung Tâm Tin học Đại Học Khoa Học Tự Nhiên";
		System.out.println("Dang ghi tap tin");
		
		try {
			FileWriter fw = new FileWriter("t3h.txt");
			fw.write(s);
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
		System.out.println("Doc tap tin");
		try (FileReader fr = new FileReader("t3h.txt")){
			int b;
			while((b = fr.read()) != -1)
				System.out.println((char)b);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
