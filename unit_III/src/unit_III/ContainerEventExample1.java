package unit_III;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ContainerEventExample1{
		
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		jf.setLayout(new FlowLayout());
		JPanel jp = new JPanel();
		jf.add(jp);
		
		jp.addContainerListener(new ContainerListener() {
			@Override
			public void componentRemoved(ContainerEvent e) {
				System.out.println("Component Removed "+e.toString());
			}
			
			@Override
			public void componentAdded(ContainerEvent e) {
				System.out.println("Component Added "+e.toString());
			}
		});
		
		JButton btn1 = new JButton("One");
		jp.add(btn1);//componentAdded()
		jp.revalidate();
		
		JButton btn2 = new JButton("Two");
		jp.add(btn2);//componentAdded()
		jp.revalidate();	
		
		jf.setVisible(true);
		jf.setSize(700, 700);
		jf.setLocation(100,100);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		jp.remove(btn2);//componentRemoved()
		jp.revalidate();
		
	}
}
