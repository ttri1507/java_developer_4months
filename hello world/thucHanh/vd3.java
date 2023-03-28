package Mang;
import java.util.Random;


public class vd3 {

	public static void main(String[] args) {
		//Vi du 1 tao mang 2 chieu
		int[][] a;
		a = new int[2][2];
		a[0][0] = 1;
		a[0][1] = 2;
		a[1][0] = 3;
		a[1][1] = 4;
		System.out.println(String.format("%d %d", a[0][0], a[0][1]));
		System.out.println(String.format("%d %d", a[1][0], a[1][1]));
		
		// Vidu 2 phat sinh mang 2 chieu
		double[][] b = new double[4][5];
		Random rd = new Random();
		
		for (int i=0;i<b.length;i++) {
			for (int j =0; j<b[i].length; j++) {
				b[i][j] = rd.nextDouble(21);
				System.out.print(String.format("%7.2f", b[i][j]));
				
			}
			System.out.println();
			
		}
	}

}
