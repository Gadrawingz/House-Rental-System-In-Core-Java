package FormPackage;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;

public class HouseForm {

	private JFrame frame;
	private JTextField houseId;
	private JComboBox houseSize;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseForm window = new HouseForm();
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
	public HouseForm() {
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
		
		JLabel lblNewLabel = new JLabel("House Registration");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(0, 0, 128));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(40, 22, 407, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnSave = new JButton("Add");
		btnSave.setForeground(new Color(255, 255, 255));
		btnSave.setBackground(new Color(0, 0, 128));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSave.setBounds(40, 246, 124, 35);
		frame.getContentPane().add(btnSave);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBackground(new Color(178, 34, 34));
		btnReset.setBounds(323, 246, 124, 35);
		frame.getContentPane().add(btnReset);
		
		JLabel lblNewLabel_1 = new JLabel("House Rooms");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(276, 67, 124, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("House ID");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(40, 67, 124, 29);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel tenantEmail = new JLabel("House Size:");
		tenantEmail.setForeground(Color.WHITE);
		tenantEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		tenantEmail.setBounds(276, 138, 124, 29);
		frame.getContentPane().add(tenantEmail);
		
		JLabel lblNewLabel_1_3 = new JLabel("House Price");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(40, 138, 137, 29);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		houseId = new JTextField();
		houseId.setColumns(10);
		houseId.setBounds(40, 95, 171, 29);
		frame.getContentPane().add(houseId);
		
		houseSize = new JComboBox();
		houseSize.setBounds(276, 167, 171, 29);
		frame.getContentPane().add(houseSize);
		
		JComboBox houseRooms = new JComboBox();
		houseRooms.setBounds(276, 98, 171, 29);
		frame.getContentPane().add(houseRooms);
		
		JComboBox housePrice = new JComboBox();
		housePrice.setBounds(40, 167, 171, 29);
		frame.getContentPane().add(housePrice);
	}
}
