package baiTap.BT5_4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Arrays;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmBT5_4 extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private String[][] cart = new String[0][];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmBT5_4 frame = new FrmBT5_4();
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
	public FrmBT5_4() {
		setTitle("B\u00E0i t\u1EADp 5.4");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				File folder = new File("src/baiTap/BT5_4/HinhSanPham");
				File[] mf = folder.listFiles();
				for(File file:mf) {
					String tt = file.getAbsolutePath();
					ImageIcon icon = new ImageIcon(tt);
					icon.setImage(icon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
					
					JLabel lbl = new JLabel();
					lbl.setSize(100, 100);
					lbl.setIcon(icon);
					
					lbl.addMouseListener(new MouseListener() {
						@Override
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							int chon = JOptionPane.showConfirmDialog(rootPane, "Ban muon mua "+file.getName(), "Xac nhan", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
							if(chon == JOptionPane.YES_OPTION) {
								JOptionPane.showMessageDialog(rootPane, "Ban da chon mua "+file.getName());
								cart = Arrays.copyOf(cart, cart.length+1);
								cart[cart.length-1] = new String[] {file.getName(),"70"};
							}
						}

						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
					});
					panel.add(lbl);
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmCart fc = new FrmCart();
				fc.setCart(cart);
				fc.setVisible(true);
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 5));
	}

}
