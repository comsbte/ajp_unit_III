package unit_III;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;    
public class FocusEventExample implements FocusListener{
	
	JProgressBar jpb = new JProgressBar(0,100);
	int counter = 0;
	
	public static void main(String[] args) {
		JFrame jf = new JFrame("Progress bar");
		jf.setLayout(new FlowLayout());
		
		FocusEventExample fee = new FocusEventExample();
		
		fee.jpb.setValue(0);
		fee.jpb.setStringPainted(true);
		
		jf.add(fee.jpb);
		
		JLabel lq1 = new JLabel("What is your name?");
		JTextField txtq1 = new JTextField(20);
		txtq1.addFocusListener(fee);
		
		jf.add(lq1);
		jf.add(txtq1);
		
		JLabel lq2 = new JLabel("What is your hobby?");
		JTextField txtq2 = new JTextField(20);
		txtq2.addFocusListener(fee);
		
		jf.add(lq2);
		jf.add(txtq2);
		
		JLabel lq3 = new JLabel("What is your college name?");
		JTextField txtq3 = new JTextField(20);
		txtq3.addFocusListener(fee);
		
		jf.add(lq3);
		jf.add(txtq3);
		
		JLabel lq4 = new JLabel("What is your favorite colour?");
		JTextField txtq4 = new JTextField(20);
		txtq4.addFocusListener(fee);
		
		jf.add(lq4);
		jf.add(txtq4);
		
		JButton jb = new JButton("Submit");
		jf.add(jb);
		
		jf.setVisible(true);
		jf.setSize(250, 400);
		jf.setLocation(200, 200);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	@Override
	public void focusGained(FocusEvent e) {
		if(e.isTemporary())
			System.out.println("Focus Gain Temporary");
		else
			System.out.println("Focus Gain Permanently");
	}
	@Override
	public void focusLost(FocusEvent e) {
		if(e.isTemporary())
			System.out.println("Focus Lost Temporary");
		
		else {
			counter = counter + 25;
			jpb.setValue(counter);
			System.out.println("Focus Lost Permanetly");
		}
	}
	    
}