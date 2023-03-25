package hello;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;

public class Hien_thi_thong_tin {

	private JFrame frmThngTinLin;
	private JTextField txtTen;
	private JTextField txtDtdd;
	private JTextField txtHinhAnh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hien_thi_thong_tin window = new Hien_thi_thong_tin();
					window.frmThngTinLin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hien_thi_thong_tin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmThngTinLin = new JFrame();
		frmThngTinLin.setTitle("Thông tin liên hệ");
		frmThngTinLin.setBounds(100, 100, 450, 722);
		frmThngTinLin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmThngTinLin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thông tin liên hệ");
		lblNewLabel.setBounds(10, 11, 122, 14);
		frmThngTinLin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Họ Tên");
		lblNewLabel_1.setBounds(20, 36, 90, 14);
		frmThngTinLin.getContentPane().add(lblNewLabel_1);
		
		txtTen = new JTextField();
		txtTen.setBounds(120, 33, 304, 20);
		frmThngTinLin.getContentPane().add(txtTen);
		txtTen.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("ĐTDĐ");
		lblNewLabel_1_1.setBounds(20, 77, 90, 14);
		frmThngTinLin.getContentPane().add(lblNewLabel_1_1);
		
		txtDtdd = new JTextField();
		txtDtdd.setColumns(10);
		txtDtdd.setBounds(120, 74, 127, 20);
		frmThngTinLin.getContentPane().add(txtDtdd);
		
		JLabel lblNewLabel_1_2 = new JLabel("Hình ảnh");
		lblNewLabel_1_2.setBounds(20, 120, 90, 14);
		frmThngTinLin.getContentPane().add(lblNewLabel_1_2);
		
		txtHinhAnh = new JTextField();
		txtHinhAnh.setColumns(10);
		txtHinhAnh.setBounds(120, 117, 304, 20);
		frmThngTinLin.getContentPane().add(txtHinhAnh);
		

		
		JLabel lblNewLabel_1_3 = new JLabel("Họ Tên");
		lblNewLabel_1_3.setBounds(20, 244, 90, 14);
		frmThngTinLin.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ĐTDĐ");
		lblNewLabel_1_1_1.setBounds(20, 285, 90, 14);
		frmThngTinLin.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Hình ảnh");
		lblNewLabel_1_2_1.setBounds(20, 328, 90, 14);
		frmThngTinLin.getContentPane().add(lblNewLabel_1_2_1);
		
		final JLabel lblTen = new JLabel("");
		lblTen.setBounds(120, 244, 304, 14);
		frmThngTinLin.getContentPane().add(lblTen);
		
		final JLabel lblsdt = new JLabel("");
		lblsdt.setBounds(120, 285, 127, 14);
		frmThngTinLin.getContentPane().add(lblsdt);
		
		final JLabel lblhinhanh = new JLabel("");
		lblhinhanh.setIcon(new ImageIcon(Hien_thi_thong_tin.class.getResource("/hello/IMG_16821.jpg")));
		lblhinhanh.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblhinhanh.setBounds(120, 328, 304, 344);
		frmThngTinLin.getContentPane().add(lblhinhanh);
		
		JButton btnHienThi = new JButton("Hiển Thị");
		btnHienThi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ten = txtTen.getText();
				String sdt = txtDtdd.getText();
				String tapTin = txtHinhAnh.getText();
				lblTen.setText(ten);
				lblsdt.setText(sdt);
				ImageIcon icon = new ImageIcon(tapTin);
				icon.setImage(icon.getImage().getScaledInstance(lblhinhanh.getWidth(), lblhinhanh.getHeight(), Image.SCALE_DEFAULT));
				lblhinhanh.setIcon(icon);
				
			}
		});
		btnHienThi.setBounds(120, 167, 89, 23);
		frmThngTinLin.getContentPane().add(btnHienThi);
		

	}
}
