package FormPackage;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;

public class TenantForm {

	private JFrame frame;
	private JTextField tenantNames;
	private JTextField tenantTel;
	private JComboBox bookedHouse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TenantForm window = new TenantForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TenantForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 102, 51));
		frame.setBounds(100, 100, 519, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tenant Registration");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(0, 0, 128));
		lblNewLabel.setForeground(new Color(255, 228, 225));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 26));
		lblNewLabel.setBounds(40, 22, 371, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnSave = new JButton("Save");
		btnSave.setForeground(new Color(255, 255, 255));
		btnSave.setBackground(new Color(0, 0, 128));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSave.setBounds(42, 265, 110, 35);
		frame.getContentPane().add(btnSave);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBackground(new Color(178, 34, 34));
		btnReset.setBounds(337, 265, 110, 35);
		frame.getContentPane().add(btnReset);
		
		btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
			
		});
		
		JLabel lblNewLabel_1 = new JLabel("Tenant ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(276, 67, 124, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextField tenantId = new JTextField();
		tenantId.setBounds(276, 95, 171, 29);
		frame.getContentPane().add(tenantId);
		tenantId.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tenant Names");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(40, 67, 124, 29);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel tenantEmail = new JLabel("Available House");
		tenantEmail.setForeground(Color.WHITE);
		tenantEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		tenantEmail.setBounds(276, 138, 124, 29);
		frame.getContentPane().add(tenantEmail);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tenant Tel.Number");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(40, 138, 137, 29);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		tenantNames = new JTextField();
		tenantNames.setColumns(10);
		tenantNames.setBounds(40, 95, 171, 29);
		frame.getContentPane().add(tenantNames);
		
		tenantTel = new JTextField();
		tenantTel.setColumns(10);
		tenantTel.setBounds(40, 167, 171, 29);
		frame.getContentPane().add(tenantTel);
		
		bookedHouse = new JComboBox();
		bookedHouse.setBounds(276, 167, 171, 29);
		frame.getContentPane().add(bookedHouse);
	}
}
