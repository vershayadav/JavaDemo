import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener{
  private Container c;
  private JLabel label1, label2, result;
  private JTextField t1,t2;
   private JButton add, sub, mul, dev;
  
 Calculator(){
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setBounds(100,100,300,300);
 setTitle("Calculator");
 
 c= getContentPane();
 c.setLayout(null);
 
 label1 = new JLabel("field1");
 label1.setBounds(30,50,100,30);
 c.add(label1);
 
 label2 = new JLabel("field2");
 label2.setBounds(30,100,100,30);
 c.add(label2);
 
 t1 =new JTextField();
 t1.setBounds(100,50,100,30);
 c.add(t1);
 
 t2 =new JTextField();
 t2.setBounds(100,100,100,30);
 c.add(t2);
 
 add = new JButton("+");
 sub = new JButton("-");
 mul = new JButton("x");
 dev = new JButton("/");
  
  add.setBounds(30,150,50,30);
  sub.setBounds(80,150,50,30);
  mul.setBounds(130,150,50,30);
  dev.setBounds(180,150,50,30);
  
  c.add(add);
  c.add(sub);
  c.add(mul);
  c.add(dev);
  
add.addActionListener(this);
sub.addActionListener(this); 
mul.addActionListener(this);
dev.addActionListener(this);

result = new JLabel("result :");
result.setBounds(30,200,200,30);
c.add(result);
setVisible(true);
}
public void actionPerformed(ActionEvent e){
	try{
if(e.getSource()==add){
 int a = Integer.parseInt(t1.getText()); 
 int b = Integer.parseInt(t2.getText());
 int c = a+b;
result.setText("result : " + c); 
}

if(e.getSource()==sub){
 int a = Integer.parseInt(t1.getText()); 
 int b = Integer.parseInt(t2.getText());
 int c = a-b;
result.setText("result : " + c); 
}

if(e.getSource()==mul){
 int a = Integer.parseInt(t1.getText()); 
 int b = Integer.parseInt(t2.getText());
 int c = a*b;
result.setText("result : " + c); 
}

if(e.getSource()==dev){
 int a = Integer.parseInt(t1.getText()); 
 int b = Integer.parseInt(t2.getText());
 int c = a/b;
result.setText("result : " + c); 
}
	}
	catch(NumberFormatException e1){
	result.setText("plese input integer only ");	
	}
	catch(ArithmeticException e2){
	result.setText("can not devided by zero");	
	}
 
}
}
class Calc{
public static void main(String[] args){
Calculator f = new Calculator();
}
}