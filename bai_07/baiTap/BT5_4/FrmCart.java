package baiTap.BT5_4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmCart extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private String[][] cart;
	
	public String[][] getCart(){
		return cart;
	}
	public void setCart(String[][] cart) {
		this.cart = cart;
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCart frame = new FrmCart();
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
	public FrmCart() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				DefaultTableModel dtm = new DefaultTableModel(cart, new String[] {"Product","Price"});
				table.setModel(dtm);
			}
		});
		setTitle("Cart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 279);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 22, 392, 158);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {}
			,
			new String[] {
				"Product", "Price"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnPayment = new JButton("Payment");
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmPayInfo fi = new FrmPayInfo();
				fi.setVisible(true);
			}
		});
		btnPayment.setBounds(175, 207, 89, 23);
		contentPane.add(btnPayment);
	}
}
