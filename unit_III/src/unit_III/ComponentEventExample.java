package unit_III;

import java.awt.FlowLayout;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ComponentEventExample implements ComponentListener{

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		//Try Same program by setting layout as Flowlayout
		jf.setLayout(new FlowLayout());
		
		ComponentEventExample cee  = new ComponentEventExample();
		jf.addComponentListener(cee);
		
		JButton btn = new JButton("ADD");
		jf.add(btn);
		btn.addComponentListener(new ComponentListener() {
			@Override
			public void componentResized(ComponentEvent e) {
				System.out.println("JButton component Resized");
			}

			@Override
			public void componentMoved(ComponentEvent e) {
				System.out.println("JButton component Moved");
			}

			@Override
			public void componentShown(ComponentEvent e) {
				System.out.println("JButton component Shown");
			}

			@Override
			public void componentHidden(ComponentEvent e) {
				System.out.println("JButton component Hidden");
			}
		});
		
		
		jf.setVisible(true);
		jf.setSize(400, 400);//resize
		jf.setLocation(100,100);//moved
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		jf.setVisible(false);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		jf.setVisible(true);
		
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		btn.setVisible(false);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		btn.setVisible(true);
	}
	
	@Override
	public void componentResized(ComponentEvent e) {
		System.out.println("JFrame component Resized");
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		System.out.println("JFrame component Moved");
	}

	@Override
	public void componentShown(ComponentEvent e) {
		System.out.println("JFrame component Shown");
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		System.out.println("JFrame component Hidden");
	}

}
