package baiTap;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class FrmBT4_4 extends JFrame {

	private JPanel contentPane;
	private JTextField txtTen;
	private JTextField txtNam;
	private String[] m = new String[0];
	private JList list;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmBT4_4 frame = new FrmBT4_4();
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
	public FrmBT4_4() {
		setTitle("Bài tập 4.4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên:");
		lblNewLabel.setBounds(50, 32, 88, 14);
		contentPane.add(lblNewLabel);
		
		txtTen = new JTextField();
		txtTen.setBounds(148, 29, 86, 20);
		contentPane.add(txtTen);
		txtTen.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Năm sinh:");
		lblNewLabel_1.setBounds(50, 68, 88, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNam = new JTextField();
		txtNam.setBounds(148, 65, 86, 20);
		contentPane.add(txtNam);
		txtNam.setColumns(10);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ten, nam;
				ten = txtTen.getText();
				nam = txtNam.getText();
				if(ten.trim().length()==0 || nam.trim().length()==0) {
					JOptionPane.showMessageDialog(rootPane, "Hãy nhập thông tin đầy đủ");
					return;
				}
				try {
					int t = Integer.parseInt(nam);
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(rootPane, "Hãy nhập năm sinh là số");
					txtNam.grabFocus();
					return;
				}
				m = Arrays.copyOf(m, m.length+1);
				m[m.length-1] = nam + " " + ten;
				Arrays.sort(m);
				DefaultListModel<String> dlm = new DefaultListModel<String>();
				for(String s:m) {
					dlm.addElement(s.substring(s.indexOf(' ')+1) + " " + s.substring(0, s.indexOf(' ')));
				}
				list.setModel(dlm);
			}
		});
		btnThem.setBounds(298, 44, 89, 23);
		contentPane.add(btnThem);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 105, 184, 126);
		contentPane.add(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
	}
}
