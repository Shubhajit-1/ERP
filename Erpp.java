package erp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Erpp {

	private JFrame frmStudent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Erpp window = new Erpp();
					window.frmStudent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Erpp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudent = new JFrame();
		frmStudent.getContentPane().setBackground(Color.WHITE);
		frmStudent.setTitle("Student");
		frmStudent.setBounds(100, 100, 860, 678);
		frmStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudent.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Subjects");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 22));
		btnNewButton.setBounds(59, 272, 176, 37);
		frmStudent.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Marks");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Serif", Font.BOLD, 22));
		btnNewButton_1.setBounds(330, 272, 170, 37);
		frmStudent.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Attendance");
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setFont(new Font("Serif", Font.BOLD, 22));
		btnNewButton_2.setBounds(614, 273, 174, 37);
		frmStudent.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Department");
		btnNewButton_3.setForeground(Color.RED);
		btnNewButton_3.setFont(new Font("Serif", Font.BOLD, 22));
		btnNewButton_3.setBounds(59, 508, 176, 42);
		frmStudent.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Assignment");
		btnNewButton_4.setForeground(Color.RED);
		btnNewButton_4.setFont(new Font("Serif", Font.BOLD, 22));
		btnNewButton_4.setBounds(330, 510, 170, 37);
		frmStudent.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Contact");
		btnNewButton_5.setForeground(Color.RED);
		btnNewButton_5.setFont(new Font("Serif", Font.BOLD, 22));
		btnNewButton_5.setBounds(614, 508, 174, 42);
		frmStudent.getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("Welcome to Student Portal");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblNewLabel.setBounds(223, 13, 402, 35);
		frmStudent.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBackground(Color.CYAN);
		lblNewLabel_1.setIcon(new ImageIcon("F:\\s.jpg"));
		Image img = new ImageIcon(this.getClass().getResource("/s.jpg")).getImage();
		lblNewLabel_1.setBounds(59, 87, 233, 184);
		frmStudent.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("F:\\r.jpg"));
		lblNewLabel_2.setBounds(330, 87, 239, 184);
		frmStudent.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("F:\\q.jpg"));
		lblNewLabel_3.setBounds(604, 87, 226, 178);
		frmStudent.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("F:\\w.jpg"));
		lblNewLabel_4.setBounds(29, 322, 239, 173);
		frmStudent.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("F:\\c.jpg"));
		lblNewLabel_5.setBounds(306, 343, 239, 158);
		frmStudent.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("F:\\l.jpg"));
		lblNewLabel_6.setBounds(581, 347, 233, 150);
		frmStudent.getContentPane().add(lblNewLabel_6);
		
		
	}
}
