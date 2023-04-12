package baiTap;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.TreeMap;
import java.awt.event.ActionEvent;

public class BT7_2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtWord1;
	private JTextField txtMeaning1;
	private JTextField txtWord2;
	private JTextField txtMeaning2;
	private Map<String,String> td = new TreeMap<>();
	private JList list;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BT7_2 frame = new BT7_2();
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
	public BT7_2() {
		setTitle("Dictionary");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(21, 11, 382, 239);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Show - Insert word", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Word:");
		lblNewLabel.setBounds(20, 21, 63, 14);
		panel.add(lblNewLabel);
		
		txtWord1 = new JTextField();
		txtWord1.setBounds(93, 18, 86, 20);
		panel.add(txtWord1);
		txtWord1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Meaning:");
		lblNewLabel_1.setBounds(20, 57, 63, 14);
		panel.add(lblNewLabel_1);
		
		txtMeaning1 = new JTextField();
		txtMeaning1.setBounds(93, 54, 86, 20);
		panel.add(txtMeaning1);
		txtMeaning1.setColumns(10);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String k,v;
				k = txtWord1.getText();
				v = txtMeaning1.getText();
				td.put(k, v);
				DefaultListModel<String> dlm = new DefaultListModel<>();
				for(String key:td.keySet())
					dlm.addElement(key + ":" + td.get(key));
				list.setModel(dlm);
			}
		});
		btnInsert.setBounds(220, 34, 89, 23);
		panel.add(btnInsert);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 82, 325, 118);
		panel.add(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Search", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Word:");
		lblNewLabel_2.setBounds(31, 25, 46, 14);
		panel_1.add(lblNewLabel_2);
		
		txtWord2 = new JTextField();
		txtWord2.setBounds(110, 22, 86, 20);
		panel_1.add(txtWord2);
		txtWord2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Meaning:");
		lblNewLabel_3.setBounds(31, 60, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		txtMeaning2 = new JTextField();
		txtMeaning2.setBounds(110, 57, 86, 20);
		panel_1.add(txtMeaning2);
		txtMeaning2.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String k = txtWord2.getText();
				txtMeaning2.setText(td.get(k));
			}
		});
		btnSearch.setBounds(234, 39, 89, 23);
		panel_1.add(btnSearch);
	}
}
