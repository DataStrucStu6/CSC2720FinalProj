package CSc2720FinalProj;

	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;



	public class SaveLoadPanel extends JPanel {
		
		private JButton save, load;
		private JLabel inputLabel, outputLabel, resultLabel;
		private JTextField t1, t2;
		private JPanel buttonPanel;
		
		public SaveLoadPanel() {
			inputLabel = new JLabel("Enter your text: ");
			outputLabel = new JLabel("---");
			resultLabel = new JLabel("---");
			
			t1 = new JTextField(10);
			t2 = new JTextField(10);
			t1.addActionListener(new ButtonListener());
			t2.addActionListener(new ButtonListener());
			
			save = new JButton("Save");
			load = new JButton("Load");
			
			ButtonListener listener = new ButtonListener();
			save.addActionListener(listener);
			load.addActionListener(listener);
			
			buttonPanel = new JPanel();
			buttonPanel.setPreferredSize(new Dimension(200, 40));
			buttonPanel.setBackground(Color.blue);
			buttonPanel.add(save);
			buttonPanel.add(load);
			
			add(inputLabel);
			add(t1);
			add(save);
			add(load);
			add(outputLabel);
			add(resultLabel);
			

		}
		
		private class ButtonListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				
				String savedText, loadedText;
				
				if(event.getSource() == save) {
					outputLabel.setText(t1.getText());
					resultLabel.setText("Text File was Saved");
				}
				else {
					t1.setText(outputLabel.getText());
					resultLabel.setText("Text file was loaded");
				}
			}
		}

	}
