package FormPackage;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class LoginForm {

	private JFrame frame;
	private JPasswordField adminPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
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
	public LoginForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Form");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(0, 0, 128));
		lblNewLabel.setForeground(new Color(255, 228, 225));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 26));
		lblNewLabel.setBounds(37, 25, 371, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(0, 0, 128));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogin.setBounds(76, 194, 103, 38);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBackground(new Color(178, 34, 34));
		btnReset.setBounds(228, 194, 103, 38);
		frame.getContentPane().add(btnReset);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(47, 65, 124, 38);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextField username = new JTextField();
		username.setBounds(210, 65, 156, 38);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(47, 114, 124, 38);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		adminPass = new JPasswordField();
		adminPass.setBounds(210, 114, 156, 38);
		frame.getContentPane().add(adminPass);
		
		JCheckBox chckbxShowPw = new JCheckBox("Show Password");
		chckbxShowPw.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxShowPw.setForeground(new Color(255, 255, 255));
		chckbxShowPw.setBackground(new Color(0, 128, 128));
		chckbxShowPw.setBounds(210, 155, 156, 23);
		frame.getContentPane().add(chckbxShowPw);
		
	}
	

	private void jCheckBoxPasswordActionPerformed(java.awt.event.ActionEvent evt) {
		AbstractButton chckbxShowPw;
		
	}
	
}
