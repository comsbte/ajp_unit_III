package unit_III;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextEventExample implements TextListener{
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		
		TextField tf = new TextField(20);
		f.add(tf);
		
		tf.addTextListener(new TextEventExample());
		
		f.setVisible(true);
		f.setSize(500, 500);
		f.setLocation(100,100);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e){
				f.dispose();
			}
		});
	}

	@Override
	public void textValueChanged(TextEvent e) {
		TextField tf = (TextField) e.getSource();
		System.out.println("textValueChanged "+tf.getText());
	}
}
