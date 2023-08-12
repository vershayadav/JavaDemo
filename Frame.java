    import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	
class Frame {
	public static void main(String[] args){
	JFrame f = new JFrame();
	f.setBounds(100,100,500,400);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = f.getContentPane();
	c.setLayout(null);
	
	JTextArea a = new JTextArea();
	a.setBounds(50,50,200,100);
	c.add(a);
	a.setText("My name is varsha");
	a.setText("My name is Rani");
	//a.setEnabled(false);
	a.setLineWrap(true);
	//a.setVisible(false);
	
	
	f.setVisible(true);
}
}	