package CSc2720FinalProj;

import java.awt.EventQueue;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Note {

	String note;
	
	LinkedList<String> tasks = new LinkedList<String>();
	
	public String getNotes(int t) {
		return tasks.get(t-1);
	}
	public void addNotes(String note) {
		tasks.add(note);
	}
	public void deleteNotes(int n) {
		tasks.remove(n-1);
	}
	public String getAllNotes() {
		String s ="";
		for(int i=1; i<=numofTasks(); i++) {
			s = s+"-"+getNotes(i)+"\n";
		}
		return s;
	}
	public int numofTasks() {
		return tasks.size();
	}
	
	/*------------------------------------
	 * Top for back end
	 *------------------------------------
	 *Bottom for front end
	 *------------------------------------*/
	
	
	
	
	
	
	public JFrame frame;
	private JTable table;
	private JButton btnReturnToMenu;
	private JButton btnAddNewEntry;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Note window = new Note();
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
	public Note() {
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
		
		JPanel notepanel = new JPanel();
		notepanel.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(notepanel);
		notepanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 75, 740, 475);
		notepanel.add(scrollPane);
		
				
				
				table = new JTable();
				scrollPane.setViewportView(table);

				table.setModel(new DefaultTableModel(
					new Object[][] {
						{"Location", "Comment"},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
						{null, null},
					},
					new String[] {
						"Location", "Comment"
					}
				));
				table.getColumnModel().getColumn(0).setPreferredWidth(180);
				table.getColumnModel().getColumn(1).setPreferredWidth(400);
		
		btnReturnToMenu = new JButton("Return to menu");
		btnReturnToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main = new Main();
				frame.dispose();
				main.frame.setVisible(true);
			}
		});
		btnReturnToMenu.setBounds(605, 11, 145, 53);
		notepanel.add(btnReturnToMenu);
		
		
		
		btnAddNewEntry = new JButton("+");
		btnAddNewEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TaskCreate popup = new TaskCreate();
				popup.frame.setVisible(true);
				//
				//
				//
				//
				//
			}
		});
		btnAddNewEntry.setBounds(10, 11, 145, 53);
		notepanel.add(btnAddNewEntry);
		
		button = new JButton("-");
		button.setBounds(165, 11, 145, 53);
		notepanel.add(button);
		
		

	}
}
