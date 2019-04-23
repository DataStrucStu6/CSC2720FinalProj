package CSc2720FinalProj;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class Ground extends JPanel implements KeyListener{

	protected Walker walker;
	protected int wLoc_x;
	protected int wLoc_y;
	protected boolean erase;
	
	public Ground(Walker w) {
		super();
		this.walker = w;
		this.wLoc_x = this.walker.getInitial_x();
		this.wLoc_y = this.walker.getInitial_y();
		
		addKeyListener(this);
	}
	
	public void paintComponent(Graphics g) {
		
		g.fillRect(this.walker.getWalker_x(), 
				   this.walker.getWalker_y(), 
				   this.walker.getwWidth(), 
				   this.walker.getwHeight());
	}
	
	@Override
	public void keyPressed(KeyEvent key) {
		this.wLoc_x = this.walker.getWalker_x();
		this.wLoc_y = this.walker.getWalker_y();
		
		if(key.getKeyCode() == KeyEvent.VK_DOWN) {
			this.walker.moveDown();
			
			if(this.walker.getWalker_y() > getBounds().height) {
				this.walker.setWalker_y(getBounds().height);
			}
		}
		
		if(key.getKeyCode() == KeyEvent.VK_UP) {
			this.walker.moveUp();
			
			if(this.walker.getWalker_y() > getBounds().height) {
				this.walker.setWalker_y(getBounds().height);
			}
		}
		
		if(key.getKeyCode() == KeyEvent.VK_LEFT) {
			this.walker.moveLeft();
			
			if(this.walker.getWalker_x() < 0) {
				this.walker.setWalker_x(0);
			}
		}
		
		if(key.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.walker.moveRight();
			
			if(this.walker.getWalker_x() > getBounds().width) {
				this.walker.setWalker_x(getBounds().width);
			}
		}
		
		if(key.getKeyCode() == KeyEvent.VK_SPACE) {
			erase = true;
			this.walker.setWalker_x(100);
			this.walker.setWalker_y(100);
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}