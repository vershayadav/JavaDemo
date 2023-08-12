import javax.swing.*;
import java.awt.*;
class My_frame{
public static void main(String[] args){

JFrame a = new JFrame();

a.setVisible(true);
a.setBounds(200,100,700,500);
a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
a.setTitle("my first program");
 

Container c = a.getContentPane();
c.setLayout(null);
JLabel label = new JLabel("User Name");
label.setBounds(100,50,100,30);
c.add(label);
label.setText("Password ");

Font font = new Font("Arial",Font.PLAIN,20);
Font font1 = new Font("cursive",Font.BOLD,30);
label.setFont(font);

ImageIcon icon = new ImageIcon("D:/My_pic/fruit.png");
JLabel label1 = new JLabel(icon);
label1.setBounds(100,70,200,400);
label1.setFont(font1);
c.add(label1);

JLabel label2 = new JLabel("Varsha",icon,JLabel.RIGHT);
label2.setBounds(500,100,500,100);
c.add(label2);
}
}