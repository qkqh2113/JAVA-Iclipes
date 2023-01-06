package ch06;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MyFrame extends MFrame{
	
	Random r;
	
	public MyFrame() {
		//500x500 바탕색 : WHITE, Resize : false
		super(500, 500, Color.WHITE, false);
		r = new Random();//랜덤객체
	}
	
	@Override
	public void paint(Graphics g){
		
		for (int i = 0; i < 10000; i++) {
			g.setColor(rColor());
			int x = r.nextInt(500);
			int y = r.nextInt(500);
			int w = r.nextInt(10)+5;
			int h = r.nextInt(10)+5;
			//g.drawRect(x, y, w, h);
			g.fillRect(x, y, w, h);
			try {
				Thread.sleep(1);
			}catch (Exception e) {}
			//g.drawString("반갑습니다.",60,50); 60:x 좌표 50:y좌표 
		}
	}
	public  Color rColor(){
		int rr,gg,bb;
		rr = r.nextInt(256);
		gg = r.nextInt(256);
		bb = r.nextInt(256);
		return new Color(rr,gg,bb);
	}

	public static void main(String[] args) {
		new MyFrame();
	}

}
