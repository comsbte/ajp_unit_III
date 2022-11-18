package unit_III;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;

public class MouseEventExample3  implements MouseWheelListener{

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		jf.addMouseWheelListener(new MouseEventExample3());
		
		jf.setVisible(true);
		jf.setSize(500, 500);
		jf.setLocation(100,100);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		if(e.getScrollType()==MouseWheelEvent.WHEEL_UNIT_SCROLL) {
			System.out.println("WHEEL_UNIT_SCROLL "+
					e.getWheelRotation());
		}
		else if(e.getScrollType()==MouseWheelEvent.WHEEL_BLOCK_SCROLL)
			System.out.println("WHEEL_BLOCK_SCROLL");
		
	}

}
