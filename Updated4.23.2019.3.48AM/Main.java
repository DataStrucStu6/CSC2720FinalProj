package CSc2720FinalProj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.*;

import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JPanel;


public class Main {

	public JFrame frame;
	private JButton btnShowTasks;
	private JButton btnShowMap;
	private JButton button;
	private JToggleButton tglbtnTurnOnoffLocation;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel mainmenu = new JPanel();
		mainmenu.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(mainmenu);
		mainmenu.setLayout(null);
		
		// Title
		JLabel lblWelcomeTo = new JLabel("Welcome to RemindMap");
		lblWelcomeTo.setBounds(160, 86, 500, 140);
		mainmenu.add(lblWelcomeTo);
		lblWelcomeTo.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblWelcomeTo.setHorizontalAlignment(SwingConstants.CENTER);
		
		// See tasks/reminders
		btnShowTasks = new JButton("Scheduled Tasks/Reminders");
		btnShowTasks.setBounds(300, 262, 200, 75);
		mainmenu.add(btnShowTasks);
		btnShowTasks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Note nnote = new Note();
				frame.dispose();
				nnote.frame.setVisible(true);
			}
		});
		
		// Creating a Reminder
		btnShowMap = new JButton("Create a reminder");
		btnShowMap.setBounds(300, 348, 200, 75);
		mainmenu.add(btnShowMap);
		
		// Map
		button = new JButton("Show map");
		button.setBounds(300, 434, 200, 75);
		mainmenu.add(button);
		
		// Button to toggle location
		tglbtnTurnOnoffLocation = new JToggleButton("Turn on/off location");
		tglbtnTurnOnoffLocation.setBounds(10, 11, 200, 40);
		mainmenu.add(tglbtnTurnOnoffLocation);
		tglbtnTurnOnoffLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
	
	private void createEvents()
	{
		
	}
}
