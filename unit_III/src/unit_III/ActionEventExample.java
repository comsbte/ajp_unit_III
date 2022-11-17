package unit_III;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionEventExample implements ActionListener{
	
	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		jf.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Click Me");
		
		ActionEventExample aee = new ActionEventExample();
		
		btn.addActionListener(aee);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Second ActionListner");
			}
		});
		
		jf.add(btn);
		
		jf.setVisible(true);
		jf.setSize(700, 700);
		jf.setLocation(100,100);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton) e.getSource();
		jb.setText("I am First");
		System.out.println("First Action Listener");
		
		int mod = e.getModifiers();
		System.out.println("mod="+mod);
		
		if((mod & ActionEvent.ALT_MASK) == ActionEvent.ALT_MASK)
		{
			System.out.println("Alt key is pressed while clike");
		}
		else if((mod & ActionEvent.CTRL_MASK) == ActionEvent.CTRL_MASK)
		{
			System.out.println("CTRL key is pressed while clike");
		}
		//Not all keyboards have the meta key.
		//The meta key is either labeled "META" or 
		//marked with a solid diamond "◆" symbol.
		//On Mac keyboards, 
		//the META key is represented by the the "Command/Cmd" ("⌘") key.
		
		else if((mod & ActionEvent.META_MASK) == ActionEvent.META_MASK)
		{
			System.out.println("META key is pressed while clike");
		}
		else if((mod & ActionEvent.SHIFT_MASK) == ActionEvent.SHIFT_MASK)
		{
			System.out.println("SHIFT key is pressed while clike");
		}
	}
}
