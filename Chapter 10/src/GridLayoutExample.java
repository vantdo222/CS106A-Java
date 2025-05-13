
import javax.swing.*;
import acm.program.*;
import java.awt.*;

public class GridLayoutExample extends Program {
	
	public void init() {
		setLayout(new GridLayout(2, 3));
		add(new JButton("Button 1"));
		add(new JButton("Button 2"));
		add(new JButton("Button 3"));
		add(new JButton("Button 4"));
		add(new JButton("Button 5"));
		add(new JButton("Button 6"));
	}
}
