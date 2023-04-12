package baiTap.BT5_4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class FrmPayInfo extends JFrame {

	private JPanel contentPane;
	private JTextField txtCartType;
	private JTextField txtCartNumber;
	private JTextField txtFullName;
	private JTextField txtAddress;
	private JTextField txtCountry;
	private JTextField txtZipCode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPayInfo frame = new FrmPayInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmPayInfo() {
		setTitle("Payment Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cart type");
		lblNewLabel.setBounds(55, 26, 90, 14);
		contentPane.add(lblNewLabel);
		
		txtCartType = new JTextField();
		txtCartType.setBounds(155, 23, 165, 20);
		contentPane.add(txtCartType);
		txtCartType.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cart number");
		lblNewLabel_1.setBounds(55, 56, 90, 14);
		contentPane.add(lblNewLabel_1);
		
		txtCartNumber = new JTextField();
		txtCartNumber.setBounds(155, 53, 165, 20);
		contentPane.add(txtCartNumber);
		txtCartNumber.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("BILL INFORMATION");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(122, 81, 214, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Full name");
		lblNewLabel_3.setBounds(55, 120, 79, 14);
		contentPane.add(lblNewLabel_3);
		
		txtFullName = new JTextField();
		txtFullName.setBounds(155, 120, 165, 20);
		contentPane.add(txtFullName);
		txtFullName.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Address");
		lblNewLabel_3_1.setBounds(55, 150, 79, 14);
		contentPane.add(lblNewLabel_3_1);
		
		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(155, 150, 165, 20);
		contentPane.add(txtAddress);
		
		JLabel lblNewLabel_3_2 = new JLabel("Country");
		lblNewLabel_3_2.setBounds(55, 181, 79, 14);
		contentPane.add(lblNewLabel_3_2);
		
		txtCountry = new JTextField();
		txtCountry.setColumns(10);
		txtCountry.setBounds(155, 181, 165, 20);
		contentPane.add(txtCountry);
		
		JLabel lblNewLabel_3_3 = new JLabel("Zip code");
		lblNewLabel_3_3.setBounds(55, 212, 79, 14);
		contentPane.add(lblNewLabel_3_3);
		
		txtZipCode = new JTextField();
		txtZipCode.setColumns(10);
		txtZipCode.setBounds(155, 212, 165, 20);
		contentPane.add(txtZipCode);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSubmit.setForeground(Color.RED);
		btnSubmit.setBounds(170, 264, 89, 23);
		contentPane.add(btnSubmit);
	}
}
