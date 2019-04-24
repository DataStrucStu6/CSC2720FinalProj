package CSc2720FinalProj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TaskCreate {

	public JFrame frame;
	private JTextField textField;
	private JTextField txtmmddyyyy;
	private JTextField txthhmmssHour;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TaskCreate window = new TaskCreate();
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
	public TaskCreate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 584, 411);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddress.setBounds(10, 11, 80, 25);
		panel.add(lblAddress);
		
		textField = new JTextField();
		textField.setBounds(100, 11, 474, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPriority = new JLabel("Priority:");
		lblPriority.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPriority.setBounds(10, 256, 80, 25);
		panel.add(lblPriority);
		
		JRadioButton radioButton = new JRadioButton("!");
		radioButton.setBounds(100, 259, 44, 23);
		panel.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("!!");
		radioButton_1.setBounds(144, 259, 44, 23);
		panel.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("!!!");
		radioButton_2.setBounds(190, 259, 44, 23);
		panel.add(radioButton_2);
		
		JLabel lblComment = new JLabel("Comment:");
		lblComment.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblComment.setBounds(10, 47, 80, 30);
		panel.add(lblComment);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(100, 57, 474, 127);
		panel.add(textPane);
		
		JLabel lblTime = new JLabel("Date, Time:");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTime.setBounds(10, 214, 80, 25);
		panel.add(lblTime);
		
		txtmmddyyyy = new JTextField();
		txtmmddyyyy.setText("(mm/dd/yyyy)");
		txtmmddyyyy.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtmmddyyyy.setBounds(100, 214, 190, 25);
		panel.add(txtmmddyyyy);
		txtmmddyyyy.setColumns(10);
		
		txthhmmssHour = new JTextField();
		txthhmmssHour.setText("(hh:mm:ss) 24 hour format");
		txthhmmssHour.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txthhmmssHour.setBounds(300, 214, 200, 25);
		panel.add(txthhmmssHour);
		txthhmmssHour.setColumns(10);
		
		JLabel lblRemindMeIn = new JLabel("Remind me:");
		lblRemindMeIn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRemindMeIn.setBounds(10, 292, 80, 30);
		panel.add(lblRemindMeIn);
		
		JLabel lblRepeat = new JLabel("Repeat:");
		lblRepeat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRepeat.setBounds(300, 292, 80, 30);
		panel.add(lblRepeat);
		
		// REMIND ME (WHERE)
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "In the car", "Out of the Car", "At the location"}));
		comboBox_2.setBounds(100, 294, 190, 30);
		panel.add(comboBox_2);
		
		// REPEAT EVERY...
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Everyday", "Every week", "Every 2 weeks", "Every month", "Every Year"}));
		comboBox.setBounds(384, 294, 190, 30);
		panel.add(comboBox);
		
		// WHAT TIME?
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "AM", "PM"}));
		comboBox_1.setBounds(510, 214, 44, 25);
		panel.add(comboBox_1);
		
		// CREATES A TASK
		JButton btnAddTask = new JButton("Add Task");
		btnAddTask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * PSEUDOCODE:
				 * Probably save the input, then only show Task, Comment, Date(?)
				 *
				 * 
				 * 
				 * ------- Save Input -------
				 * then
				 * frame.dispose();
				 */
			}
		});
		btnAddTask.setBounds(10, 339, 125, 60);
		panel.add(btnAddTask);
		
		// DELETES THE POPUPS
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnCancel.setBounds(449, 339, 125, 60);
		panel.add(btnCancel);
		

	}
	
	
}
