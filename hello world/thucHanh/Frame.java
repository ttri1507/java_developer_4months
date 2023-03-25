package jswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame {

	private JFrame frmTable;
	private JTable table;
	private JTextField txtTen;
	private JTextField txtDienthoai;
	private JTextField txtAnh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
					window.frmTable.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTable = new JFrame();
		frmTable.setTitle("table");
		frmTable.setBounds(100, 100, 450, 498);
		frmTable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTable.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 424, 188);
		frmTable.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"H\u1ECD T\u00EAn", "\u0110i\u1EC7n Tho\u1EA1i", "H\u00ECnh \u1EA3nh"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Họ tên");
		lblNewLabel.setBounds(25, 250, 93, 14);
		frmTable.getContentPane().add(lblNewLabel);
		
		txtTen = new JTextField();
		txtTen.setBounds(155, 247, 240, 20);
		frmTable.getContentPane().add(txtTen);
		txtTen.setColumns(10);
		
		JLabel lblinThoi = new JLabel("Điện Thoại");
		lblinThoi.setBounds(25, 311, 93, 14);
		frmTable.getContentPane().add(lblinThoi);
		
		txtDienthoai = new JTextField();
		txtDienthoai.setColumns(10);
		txtDienthoai.setBounds(155, 308, 240, 20);
		frmTable.getContentPane().add(txtDienthoai);
		
		JLabel lblHnhnh = new JLabel("Hình ảnh");
		lblHnhnh.setBounds(25, 364, 93, 14);
		frmTable.getContentPane().add(lblHnhnh);
		
		txtAnh = new JTextField();
		txtAnh.setColumns(10);
		txtAnh.setBounds(155, 361, 240, 20);
		frmTable.getContentPane().add(txtAnh);
		
		JButton btnNhap = new JButton("Thêm");
		btnNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ht, dt, ha;
				ht = txtTen.getText();
				dt = txtDienthoai.getText();
				ha = txtAnh.getText();
				
//				table.setValueAt(ht, 0, 0);
//				table.setValueAt(dt, 0, 1);
//				table.setValueAt(ha, 0, 2);
				
				//them dong moi vao cuoi bang
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				dtm.addRow(new Object[] {ht,dt,ha});
				
			}
		});
		btnNhap.setBounds(161, 425, 89, 23);
		frmTable.getContentPane().add(btnNhap);
	}
}
