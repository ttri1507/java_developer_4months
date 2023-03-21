package thuchanh;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class semhinhh {

	private JFrame frmXemHinh;
	private JTextField txtTeptin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					semhinhh window = new semhinhh();
					window.frmXemHinh.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public semhinhh() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmXemHinh = new JFrame();
		frmXemHinh.setTitle("Xem hinh");
		frmXemHinh.setBounds(100, 100, 450, 365);
		frmXemHinh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmXemHinh.getContentPane().setLayout(null);
		
		JLabel lblHinh = new JLabel("");
		lblHinh.setIcon(new ImageIcon(semhinhh.class.getResource("/HinhAnh/1_cat.png")));
		lblHinh.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblHinh.setBounds(109, 28, 229, 224);
		frmXemHinh.getContentPane().add(lblHinh);
		
		JLabel lblNewLabel_1 = new JLabel("Browse:");
		lblNewLabel_1.setBounds(34, 266, 54, 14);
		frmXemHinh.getContentPane().add(lblNewLabel_1);
		
		txtTeptin = new JTextField();
		txtTeptin.setBounds(119, 263, 218, 20);
		frmXemHinh.getContentPane().add(txtTeptin);
		txtTeptin.setColumns(10);
		
		JButton lblXemHinh = new JButton("Open");
		lblXemHinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Taptin = txtTeptin.getText();
				ImageIcon icon = new ImageIcon(Taptin);
				icon.setImage(icon.getImage().getScaledInstance(lblHinh.getWidth(), lblHinh.getHeight(), Image.SCALE_DEFAULT));
				lblHinh.setIcon(icon);
				
			}
		});

		lblXemHinh.setBounds(185, 294, 89, 23);
		frmXemHinh.getContentPane().add(lblXemHinh);
	}
}
