package Mang;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Bai4_1 {

	JFrame frmTnhTngCc;
	private JTextField txtN;
	private JTextField txtTong;
	
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
					Bai4_1 window = new Bai4_1();
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
	public Bai4_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTnhTngCc = new JFrame();
		frmTnhTngCc.setTitle("Tính tổng các phần tử trong mảng");
		frmTnhTngCc.setBounds(100, 100, 450, 300);
		frmTnhTngCc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTnhTngCc.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(133, 62, 264, 105);
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
		lblMngcPht.setBounds(24, 62, 111, 28);
		frmTnhTngCc.getContentPane().add(lblMngcPht);
		
		txtN = new JTextField();
		txtN.setBounds(133, 31, 86, 20);
		frmTnhTngCc.getContentPane().add(txtN);
		txtN.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tổng");
		lblNewLabel_1.setBounds(24, 187, 46, 14);
		frmTnhTngCc.getContentPane().add(lblNewLabel_1);
		
		txtTong = new JTextField();
		txtTong.setBounds(133, 184, 86, 20);
		frmTnhTngCc.getContentPane().add(txtTong);
		txtTong.setColumns(10);
		
		JButton btnTinhTong = new JButton("Tính tổng");
		btnTinhTong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String so_phan_tu = txtN.getText();
				int so_phan_tu1 =Integer.parseInt(so_phan_tu);
				//20
				int[] Mang = mang(so_phan_tu1);
				String mangChuoi1 = mangChuoi(Mang);
				int tong_chuoi = tong(Mang);
				String s =Integer.toString(tong_chuoi);
				txtMang.setText(mangChuoi1);
				txtTong.setText(s);
			}
		});
		btnTinhTong.setBounds(179, 227, 89, 23);
		frmTnhTngCc.getContentPane().add(btnTinhTong);
	}
}
