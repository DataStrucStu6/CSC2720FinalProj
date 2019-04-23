package CSc2720FinalProj;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame {
private JPanel contentPanel;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				Main frame = new Main();
				
				JFrame frame1 = new JFrame("Final Project");
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.setSize(800, 600);
				frame1.setBackground(Color.BLUE);
				frame1.setVisible(true);
				
				JLabel home = new JLabel("Home");
				home.setLocation(400, 600);
				home.setSize(50, 50);
				JLabel Publix = new JLabel("Publix");
				Publix.setLocation(600, 400);
				Publix.setSize(50, 50);
				JLabel Pharmacy = new JLabel("Pharmacy");
				Pharmacy.setLocation(400, 200);
				Pharmacy.setSize(50, 50);
				
				Walker w = new Walker();
				SaveLoadPanel button = new SaveLoadPanel();
				
				
				Ground panel = new Ground(w);
				panel.setFocusable(true);
				frame1.setContentPane(panel);
				frame1.add(home);
				frame1.getContentPane().add(home);
				frame1.getContentPane().add(Publix);
				frame1.add(Pharmacy);
				button.setSize(100, 50);
				frame1.add(button);
				
				
				frame1.setVisible(true);
				
			}
		});
	}
}
