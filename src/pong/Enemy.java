package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Enemy {
	
	public boolean right;
	public boolean left;
	
	public double x, y;
	public int width,height;
	
	public Enemy(int x , int y) {
		this.x = x;
		this.y = y;
		this.width = 40;
		this.height = 5;
	}
	
	public void tick() {
		if(right) {
			x-=2;
		}else if(left) {
			x+=2;
		}
		if(x+width > Game.WIDTH) {
			x = Game.WIDTH - width;
		}else if(x < 0) {
			x = 0;
		}
	}
	
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect((int)x,(int) y, width, height);
		
	}

}
