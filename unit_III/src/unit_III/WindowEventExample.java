package unit_III;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WindowEventExample implements WindowFocusListener{

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.addWindowFocusListener(new WindowEventExample());
		
		jf.setVisible(true);
		jf.setSize(500, 500);
		jf.setLocation(100,100);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		System.out.println("windowGainedFocus");
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		System.out.println("windowLostFocus (Closed OR Minimized)");
		
		JFrame jf = (JFrame) e.getSource();
		
		JDialog d = new JDialog(jf);
		d.setSize(400, 200);
		d.setLocation(100,100);
		
		d.add(new JLabel("Frame is Closed/Minimized please check below"));
		
		d.setVisible(true);
		d.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
	}

}
