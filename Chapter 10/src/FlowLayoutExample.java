
import javax.swing.*;
import acm.program.*;
import java.awt.*;

public class FlowLayoutExample extends Program {
	
	public void init() {
		setLayout(new FlowLayout());
		add(new JButton("Button 1"));
		add(new JButton("Button 2"));
		add(new JButton("Button 3"));
		add(new JButton("Button 4"));
		add(new JButton("Button 5"));
		add(new JButton("Button 6"));
	}

}
