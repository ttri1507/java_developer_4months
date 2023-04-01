package baiTap;

import java.awt.EventQueue;
import java.util.Arrays;
import java.util.Comparator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmBT4_5 {

	private JFrame frmScoreBoard;
	private JTextField txtTen;
	private JTextField txtDiem;
	private JTextField txtFind;
	private JList<String> list;
	String[][] ds = new String[0][0];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmBT4_5 window = new FrmBT4_5();
					window.frmScoreBoard.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmBT4_5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmScoreBoard = new JFrame();
		frmScoreBoard.setTitle("Score board");
		frmScoreBoard.setBounds(100, 100, 526, 300);
		frmScoreBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmScoreBoard.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(27, 30, 46, 14);
		frmScoreBoard.getContentPane().add(lblNewLabel);
		
		txtTen = new JTextField();
		txtTen.setBounds(85, 27, 86, 20);
		frmScoreBoard.getContentPane().add(txtTen);
		txtTen.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Score");
		lblNewLabel_1.setBounds(191, 30, 46, 14);
		frmScoreBoard.getContentPane().add(lblNewLabel_1);
		
		txtDiem = new JTextField();
		txtDiem.setBounds(247, 27, 86, 20);
		frmScoreBoard.getContentPane().add(txtDiem);
		txtDiem.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Add();
			}
		});
		btnAdd.setBounds(372, 59, 107, 23);
		frmScoreBoard.getContentPane().add(btnAdd);
		
		JButton btnSortName = new JButton("Sort name");
		btnSortName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SortName();
			}
		});
		btnSortName.setBounds(372, 93, 107, 23);
		frmScoreBoard.getContentPane().add(btnSortName);
		
		JButton btnSortScore = new JButton("Sort score");
		btnSortScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SortScore();
			}
		});
		btnSortScore.setBounds(372, 127, 107, 23);
		frmScoreBoard.getContentPane().add(btnSortScore);
		
		JButton btnNewButton_3 = new JButton("Find");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String find = txtFind.getText().trim();
				if(find.isEmpty()) {
					JOptionPane.showMessageDialog(txtFind, "Hãy nhập giá trị tìm");
					txtFind.grabFocus();
					return;
				}
				String diem="", tb="",ten="";
				if(Character.isDigit(find.charAt(0))) {
					tb = "Khong tim thay diem "+find + " trong danh sach";
					for(String[] s:ds) {
						diem = s[1];
						if(diem.equals(find))
							tb = "Tim thay diem "+find + " trong danh sach";
					}
				}else {
					tb = "Khong tim thay ten "+find + " trong danh sach";
					for(String[] s:ds) {
						ten = s[0];
						if(ten.equals(find))
							tb = "Tim thay ten "+find + " trong danh sach";
					}
				}
				JOptionPane.showMessageDialog(frmScoreBoard, tb);
			}
		});
		btnNewButton_3.setBounds(372, 202, 107, 23);
		frmScoreBoard.getContentPane().add(btnNewButton_3);
		
		txtFind = new JTextField();
		txtFind.setBounds(372, 171, 107, 20);
		frmScoreBoard.getContentPane().add(txtFind);
		txtFind.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(57, 93, 264, 137);
		frmScoreBoard.getContentPane().add(scrollPane);
		
		list = new JList<>();
		scrollPane.setColumnHeaderView(list);
	}
	
	private void Add() {
		String ten, diem;
		ten = txtTen.getText();
		diem = txtDiem.getText();
		if(ten.isEmpty() || diem.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Hay nhap du lieu day du");
			return;
		}
		try {
			if(Float.parseFloat(diem)<0 || Float.parseFloat(diem)>10) {
				JOptionPane.showMessageDialog(null, "Diem nhap tu 0 den 10");
				return;
			}
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Diem nhap khong hop le");
			return;
		}
		ds=Arrays.copyOf(ds,ds.length+1);
		ds[ds.length-1]= new String[] {ten,diem};

		DefaultListModel<String> dlm = new DefaultListModel<String>();
		for(String[] s:ds) 
			dlm.addElement(s[0]+" "+s[1]);
		list.setModel(dlm);
		
	}
	private void SortName() {
		String s1, s2;
		String[] tg;
		for(int i=0; i<ds.length-1; i++)
			for(int j=i+1; j<ds.length; j++) {
				s1 = ds[i][0];
				s2 = ds[j][0];
				if(s1.compareTo(s2)>0) {
					tg=ds[i];
					ds[i] = ds[j];
					ds[j] = tg;
				}
			}
		DefaultListModel<String> dlm = new DefaultListModel<String>();
		for(String[] s:ds) 
			dlm.addElement(s[0]+" "+s[1]);
		list.setModel(dlm);
	}
	private void SortScore() {
		float d1, d2;
		String[] tg;
		for(int i=0; i<ds.length-1; i++)
			for(int j=i+1; j<ds.length; j++) {
				d1 = Float.parseFloat(ds[i][1]);
				d2 = Float.parseFloat(ds[j][1]);
				if(d1>d2) {
					tg=ds[i];
					ds[i] = ds[j];
					ds[j] = tg;		
				}
			}

		DefaultListModel<String> dlm = new DefaultListModel<String>();
		for(String[] s:ds) 
			dlm.addElement(s[0]+" "+s[1]);
		list.setModel(dlm);
	}
}
