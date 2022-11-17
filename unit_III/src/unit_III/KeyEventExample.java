package unit_III;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class KeyEventExample implements KeyListener{
	public static void main(String[] args) {
		JFrame jf = new JFrame("Key Listener");
		jf.setLayout(new FlowLayout());
		
		JTextField jpf = new JTextField(20);
		jf.add(jpf);
		
		jpf.addKeyListener(new KeyEventExample());
		
		jf.setVisible(true);
		jf.setSize(700, 700);
		jf.setLocation(100,100);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("keyTyped");
		System.out.println(e.getKeyChar());
		System.out.println(e.getKeyCode());
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyPressed");
		JTextField jtf = (JTextField) e.getSource();
		System.out.println(e.getKeyChar());
		System.out.println(e.getKeyCode());
		if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE) {
			jtf.setText("");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("keyReleased");
		System.out.println(e.getKeyChar());
		System.out.println(e.getKeyCode());
	}
}
