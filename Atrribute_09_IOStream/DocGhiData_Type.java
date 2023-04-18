package thuchanh;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class DocGhiData_Type{

	public static void main(String[] args) throws IOException {
		int[] a = {1,5,21,4,3,2};
		System.out.println("Dang ghi tap tin...");
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("mang.dat"));
		for(int so:a)
			dos.writeInt(so);
		dos.close();
		
		System.out.println("Doc tap tin");
		DataInputStream dis = new DataInputStream(new FileInputStream("mang.dat"));
		int so;
		while(true) {
			try {
				so = dis.readInt();
				System.out.print(so+ " ");
			} catch(Exception e) {
				break;
			}
		}
		dis.close();
		
	}

}
