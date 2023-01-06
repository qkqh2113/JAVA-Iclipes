package ch06;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ThisEx3 extends MFrame
implements ActionListener{
	
	Button btn;
	Random r;
	
	public  Color rColor(){
		int rr,gg,bb;
		rr = r.nextInt(256);
		gg = r.nextInt(256);
		bb = r.nextInt(256);
		return new Color(rr,gg,bb);
	}
	public ThisEx3() {
		super(500, 350,Color.GREEN,true);
		btn = new Button("my button");
		add(btn, "South");
		btn.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("보이나요?");
		MDialog md = new MDialog(this, "보이나요");
	}
	
	class MDialog extends Dialog
	implements ActionListener{
		
		Button mbtn;
		ThisEx3 f;
		
		public MDialog(ThisEx3 f,String title) {
			super(f, title, true);
			this.f = f;
			setLayout(new FlowLayout());
			setSize(150,100);
			mbtn = new Button("Click!");
			mbtn.addActionListener(this);
			add(mbtn);
			setVisible(true);
		}
		public void actionPerformed(ActionEvent e) {
			f.btn.setBackground(Color.red);
			dispose();
		}
	}
	public static void main(String[] args) {
		
		new ThisEx3();
	}

}
