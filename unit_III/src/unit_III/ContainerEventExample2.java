package unit_III;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Counter
{
	int count =0;
	int getCount() {
		return count;
	}
	void setCount(int c) {
		count = c;
	}
}

public class ContainerEventExample2{
		
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		final Counter cobj = new Counter();
		
		JButton btnArr[]=new JButton[5];
		
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
		
		JButton btnAdd = new JButton("ADD Btn");
		jp.add(btnAdd);
		jp.revalidate();
		
		JButton btnRemove = new JButton("Remove Btn");
		jp.add(btnRemove);
		jp.revalidate();
		
		btnRemove.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = cobj.getCount();
				jp.remove(btnArr[count-1]);
				jp.revalidate();
				cobj.setCount(count-1);
			}
		});
		
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = cobj.getCount();
				btnArr[count]= new JButton("Button"+count);
				jp.add(btnArr[count]);
				cobj.setCount(count+1);
				jp.revalidate();
			}
		});
		
		
		
		jf.setVisible(true);
		jf.setSize(700, 700);
		jf.setLocation(100,100);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
