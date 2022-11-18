package unit_III;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MouseEventExample implements MouseListener{
	
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		jf.addMouseListener(new MouseEventExample());
		
		jf.setVisible(true);
		jf.setSize(500, 500);
		jf.setLocation(100,100);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON1) {
			System.out.println("Mouse Right Clicked");			
		}
		else if(e.getButton()==MouseEvent.BUTTON2) {
			System.out.println("Mouse Button2 Clicked");
		}
		else if(e.getButton()==MouseEvent.BUTTON3) {
			System.out.println("Mouse Left Clicked");
		}
		System.out.println(e.getClickCount());
		System.out.println("X="+e.getX()+" Y="+e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouse Entered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseExited");
	}

}
