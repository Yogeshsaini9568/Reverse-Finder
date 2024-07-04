//*note*:- Make sure FILE name MAIN CLASS name must be same if you RUN this program in you COMPILER.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Frame extends JFrame{
	JLabel l,l1,l2;
	JTextField t;
	JButton b,b1;
	
   class A implements ActionListener{
		 @Override
		public void actionPerformed(ActionEvent e) {
		 
  try {
			String a=t.getText();
			String f="";
			for(int i=a.length()-1;i>=0;i--) {
					f+=a.charAt(i);
				}
			l2.setText(f);
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, "Invalid Input");
			}
		 }	
    }
    
  class B implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			t.setText(null);
			l2.setText("______");
		 }	
   }
    
Frame(){
		setTitle("FIND REVERSE");
		setSize(400,300);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(null);
       
   l= new JLabel("Enter the Input: ");
	 l.setBounds(30,15,150,40);
	 l.setForeground(Color.black);
	 add(l);
		
   l1 = new JLabel("Reverse =");
	 l1.setBounds(30,150,100,40);
	 add(l1);
		
   l2=new JLabel("______");
	 l2.setBounds(110,150,400,40);
   add(l2);

   t = new JTextField();
	 t.setBounds(160,25,150,25);
	 add(t);
		
   b = new JButton("Find Reverse");
	 b.addActionListener(new A());
	 b.setBounds(60,80,115,30);
	 add(b);
		
   b1= new JButton("Clear");
	 b1.addActionListener(new B());
	 b1.setBounds(200, 80, 70, 30);
	 add(b1);
	}
}

public class ReverseFinder {
	public static void main(String[] args) {
		Frame z=new Frame();
		z.setVisible(true);
	}

}
