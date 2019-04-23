package CSc2720FinalProj;

import java.awt.Color;

public class Walker {
	
	protected int initial_x, initial_y, walker_x, walker_y, stepSize, wHeight, wWidth;
	private Color walkerColor;
	
	public Walker() {
		this.initial_x = 100;
		this.initial_y = 100;
		
		this.walker_x = this.initial_x;
		this.walker_y = this.initial_y;
		
		this.wHeight = 8;
		this.wWidth = 8;
		
		this.stepSize = 10;
		
		this.walkerColor = Color.BLACK;
	}
	
	public Color getWalkerColor() {
		return this.walkerColor;
	}
	
	public int getWalker_x() {
		return this.walker_x;
	}
	public void setWalker_x(int walker_x) {
		this.walker_x = walker_x;
	}
	public int getWalker_y() {
		return this.walker_y;
	}
	public void setWalker_y(int walker_y) {
		this.walker_y = walker_y;
	}
	public int getInitial_x() {
		return this.walker_x;
	}
	public void setInitial_x(int initial_x) {
		this.initial_x = initial_x;
	}
	public int getInitial_y() {
		return this.walker_y;
	}
	public void setInitial_y(int initial_y) {
		this.initial_y = initial_y;
	}
	public int getwHeight() {
		return this.wHeight;
	}
	public void setwHeight(int wHeight) {
		this.wHeight = wHeight;
	}
	public int getwWidth() {
		return this.wWidth;
	}
	public void setwWidth(int wWidth) {
		this.wWidth = wWidth;
	}
	public void moveRight() {
		this.walker_x = this.walker_x + this.stepSize;
	}
	
	public void moveLeft() {
		this.walker_x = this.walker_x - this.stepSize;
	}

	public void moveUp() {
		this.walker_y = this.walker_y - this.stepSize;
	}

	public void moveDown() {
		this.walker_y = this.walker_y + this.stepSize;
	}
}
