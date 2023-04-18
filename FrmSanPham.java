package thuchanh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.awt.event.ActionEvent;

public class FrmSanPham extends JFrame {

	private JPanel contentPane;
	private JTextField txtTenSP;
	private JTextField txtSoLuong;
	private JTextField txtDonGia;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmSanPham frame = new FrmSanPham();
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
	public FrmSanPham() {
		setTitle("Nh\u1EADp s\u1EA3n ph\u1EA9m");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00EAn SP");
		lblNewLabel.setBounds(46, 38, 85, 14);
		contentPane.add(lblNewLabel);
		
		txtTenSP = new JTextField();
		txtTenSP.setBounds(141, 35, 170, 20);
		contentPane.add(txtTenSP);
		txtTenSP.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("S\u1ED1 l\u01B0\u1EE3ng");
		lblNewLabel_1.setBounds(46, 73, 85, 14);
		contentPane.add(lblNewLabel_1);
		
		txtSoLuong = new JTextField();
		txtSoLuong.setBounds(141, 70, 86, 20);
		contentPane.add(txtSoLuong);
		txtSoLuong.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u0110\u01A1n gi\u00E1");
		lblNewLabel_2.setBounds(46, 104, 85, 14);
		contentPane.add(lblNewLabel_2);
		
		txtDonGia = new JTextField();
		txtDonGia.setBounds(141, 101, 86, 20);
		contentPane.add(txtDonGia);
		txtDonGia.setColumns(10);
		
		JButton btnGhi = new JButton("Ghi");
		btnGhi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String tenSP;
				int soLuong;
				double donGia;
				
				tenSP = txtTenSP.getText();
				soLuong = Integer.parseInt(txtSoLuong.getText());
				donGia = Double.parseDouble(txtDonGia.getText());
				
				try {
					DataOutputStream dos = new DataOutputStream(new FileOutputStream("sanpham.dat",true));
					dos.writeUTF(tenSP);
					dos.writeInt(soLuong);
					dos.writeDouble(donGia);
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		btnGhi.setBounds(101, 145, 89, 23);
		contentPane.add(btnGhi);
		
		JButton btnMoi = new JButton("M\u1EDBi");
		btnMoi.setBounds(220, 145, 89, 23);
		contentPane.add(btnMoi);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(46, 198, 344, 138);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"T\u00EAn SP", "S\u1ED1 l\u01B0\u1EE3ng", "\u0110\u01A1n gi\u00E1"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Object.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnDoc = new JButton("\u0110\u1ECDc");
		btnDoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Path p = Paths.get("sanpham.dat");
					if(!Files.exists(p)) {
						JOptionPane.showMessageDialog(rootPane, "Khong co tap tin "+p.getFileName()+" nay","Thong bao",JOptionPane.OK_OPTION);
						return;
					}
					DataInputStream dis = new DataInputStream(new FileInputStream("sanpham.dat"));
					String tenSP;
					int soLuong;
					double donGia;
					DefaultTableModel dtm = (DefaultTableModel)table.getModel();
					dtm.setRowCount(0);	//xoa cac dong co truoc
					while(true) {
						try {
							tenSP = dis.readUTF();
							soLuong = dis.readInt();
							donGia = dis.readDouble();
							dtm.addRow(new Object[] {tenSP,soLuong,donGia});
						} catch (Exception e) {
							break;
						}
					}
					try {
						dis.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				
			}
		});
		btnDoc.setBounds(260, 362, 89, 23);
		contentPane.add(btnDoc);
	}
}
