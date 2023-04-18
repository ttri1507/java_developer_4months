package thuchanh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class DocGhiASCII {

	public static void main(String[] args) throws FileNotFoundException {
		int[] a = {1,5,21,4,3,2};
		System.out.println("Dang ghi tap tin...");
		PrintWriter pw = new PrintWriter(new FileOutputStream("mang.txt"));
		for(int so:a)
			pw.format("%d ", so);
		pw.close();
		
		System.out.println("Doc Tap Tin");
		Scanner scan = new Scanner(new FileInputStream("mang.txt"));
		while(scan.hasNextInt()) {
			int so = scan.nextInt();
			System.out.print(so + " ");
		}
		scan.close();

	}

}
