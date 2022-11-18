package unit_III;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class MouseEventExample2  implements MouseMotionListener{

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		jf.addMouseMotionListener(new MouseEventExample2());
		
		jf.setVisible(true);
		jf.setSize(500, 500);
		jf.setLocation(100,100);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouseDragged");
		System.out.println("X="+e.getX()+" Y="+e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("mouseMoved");
		System.out.println("X="+e.getX()+" Y="+e.getY());
	}

}
