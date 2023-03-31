 package Mang;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class hello {

	JFrame frmTnhTngCc;
	private JTextField txtN;
	private JTextField txtX;
	
	private int timX(int x, int[] mang){
		int vitri = -1;
		for(int i = 0; i <mang.length; i++){
			if(x==mang[i]){
				vitri = i;
				break;
				}
			}
			return vitri;
		}
	private boolean xLonHon(int x, int[] mang ){
		boolean flag = true;
		for(int i : mang){
			if (x <= i) {
				flag = false;
				break;
				}
			}
			return flag;
		}
	
	private String xNhoHon(int x, int[] mang){
		String kq = "";
		for(int i : mang){
			if(x < i ) kq += i + " ";
				}
				return kq;
			}
	
	
	
	private int[] mang(int n){
		int[] mang = new int[n];
		Random random = new Random();
		for(int i = 0; i < n; i++){
			mang[i] = random.nextInt(100);
		}
		 return mang;
		 }
	
	private String mangChuoi(int[] mang){
		 String chuoi = "";
		 for(int i : mang ){
			 chuoi += i + " ";
		 	}
		 return chuoi;
		}

	private int tong(int[] mang){
		 int tong = 0;
		 for(int i : mang){
			 tong += i;
		 }
		 return tong;

		}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hello window = new hello();
					window.frmTnhTngCc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public hello() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTnhTngCc = new JFrame();
		frmTnhTngCc.setTitle("Tính tổng các phần tử trong mảng");
		frmTnhTngCc.setBounds(100, 100, 450, 485);
		frmTnhTngCc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTnhTngCc.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(133, 140, 264, 105);
		frmTnhTngCc.getContentPane().add(scrollPane);
		
		final JTextArea txtMang = new JTextArea();
		txtMang.setText(" ");
		txtMang.setLineWrap(true);
		//txtMang.(" ");
		scrollPane.setColumnHeaderView(txtMang);
		
		JLabel lblNewLabel = new JLabel("Nhập n");
		lblNewLabel.setBounds(24, 31, 46, 14);
		frmTnhTngCc.getContentPane().add(lblNewLabel);
		
		JLabel lblMngcPht = new JLabel("Mảng được phát sinh");
		lblMngcPht.setBounds(24, 140, 111, 28);
		frmTnhTngCc.getContentPane().add(lblMngcPht);
		
		txtN = new JTextField();
		txtN.setBounds(133, 31, 86, 20);
		frmTnhTngCc.getContentPane().add(txtN);
		txtN.setColumns(10);
		

		
		JLabel lblNhpX = new JLabel("Nhập x");
		lblNhpX.setBounds(24, 78, 46, 14);
		frmTnhTngCc.getContentPane().add(lblNhpX);
		
		txtX = new JTextField();
		txtX.setColumns(10);
		txtX.setBounds(133, 78, 86, 20);
		frmTnhTngCc.getContentPane().add(txtX);
		
		JLabel lblKtQuTm = new JLabel("Kết quả tìm kiếm");
		lblKtQuTm.setBounds(24, 276, 111, 28);
		frmTnhTngCc.getContentPane().add(lblKtQuTm);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(133, 276, 264, 105);
		frmTnhTngCc.getContentPane().add(scrollPane_1);
		
		JTextArea txtKetQua = new JTextArea();
		txtKetQua.setLineWrap(true);
		scrollPane_1.setColumnHeaderView(txtKetQua);
		
		JButton btnTim = new JButton("Tìm Kiếm");
		btnTim.setBounds(166, 408, 89, 23);
		btnTim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(txtN.getText());
				int x = Integer.parseInt(txtX.getText());
				int[] mang = mang(n);
				String kq = "";
				txtMang.setText(mangChuoi(mang));
				int tim = timX(x, mang);
				kq += (tim == -1)? "Không tìm thấy" : "Tìm thấy tại vị trí " + tim;
				kq += "\n";
				kq += (xLonHon(x, mang))? "X lớn hơn tất cả" : "X không lớn hơn tất cả";
				kq += "\n";
				kq += "X nhỏ hơn: " + xNhoHon(x, mang);
				//JTextComponent txtKetQua;
				txtKetQua.setText(kq);
			}
		});
		frmTnhTngCc.getContentPane().add(btnTim);
	}
}