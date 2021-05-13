package revision;

import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener {
	
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bDot,bAdd,bSub,bPro,bDiv,bEq,bClr,bBck;
	JTextField tf;
	int op = 0;
	double v1 = 0, v2 = 0;
	double res = 0;
	
	Calculator(){
		
		JFrame f = new JFrame("Calculator");
		
		//creating buttons.
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		bDot = new JButton(".");
		bAdd = new JButton("+");
		bSub = new JButton("-");
		bPro = new JButton("*");
		bDiv = new JButton("/");
		bEq = new JButton("=");
		bClr = new JButton("C");
		bBck = new JButton("<-");
		
		//creating text-field
		tf = new JTextField();
		
		//setting bounds of buttons and adding them to frame.
		tf.setBounds(20, 20, 160, 30); bBck.setBounds(190, 20, 50, 30);
		f.add(tf); f.add(bBck);
		
		b1.setBounds(20,70,50,55);b2.setBounds(75,70,50,55);b3.setBounds(130,70,50,55);bAdd.setBounds(190,70,50,55);
		f.add(b1);f.add(b2);f.add(b3);f.add(bAdd);
		
		b4.setBounds(20,130,50,55);b5.setBounds(75,130,50,55);b6.setBounds(130,130,50,55);bSub.setBounds(190,130,50,55);
		f.add(b4);f.add(b5);f.add(b6);f.add(bSub);
		
		b7.setBounds(20,190,50,55);b8.setBounds(75,190,50,55);b9.setBounds(130,190,50,55);bPro.setBounds(190,190,50,55);
		f.add(b7);f.add(b8);f.add(b9);f.add(bPro);
		
		bDot.setBounds(20,250,50,55);b0.setBounds(75,250,50,55);bClr.setBounds(130,250,50,55);bDiv.setBounds(190,250,50,55);
		f.add(bDot);f.add(b0);f.add(bClr);f.add(bDiv);
		
		bEq.setBounds(75,310,105,55);
		f.add(bEq);
		
		f.setSize(270, 425);
		f.setLayout(null);
		f.setVisible(true);
		
		b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);b4.addActionListener(this);
		b5.addActionListener(this);b6.addActionListener(this);b7.addActionListener(this);b8.addActionListener(this);
		b9.addActionListener(this);b0.addActionListener(this);bAdd.addActionListener(this);bSub.addActionListener(this);
		bDot.addActionListener(this);bEq.addActionListener(this);bPro.addActionListener(this);bDiv.addActionListener(this);
		bClr.addActionListener(this);bBck.addActionListener(this);
	}

	public static void main(String[] args) {
		new Calculator();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1)
			tf.setText(tf.getText().concat("1"));
		if(e.getSource() == b2)
			tf.setText(tf.getText().concat("2"));
		if(e.getSource() == b3)
			tf.setText(tf.getText().concat("3"));
		if(e.getSource() == b4)
			tf.setText(tf.getText().concat("4"));
		if(e.getSource() == b5)
			tf.setText(tf.getText().concat("5"));
		if(e.getSource() == b6)
			tf.setText(tf.getText().concat("6"));
		if(e.getSource() == b7)
			tf.setText(tf.getText().concat("7"));
		if(e.getSource() == b8)
			tf.setText(tf.getText().concat("8"));
		if(e.getSource() == b9)
			tf.setText(tf.getText().concat("9"));
		if(e.getSource() == b0)
			tf.setText(tf.getText().concat("0"));
		if(e.getSource() == bDot)
			tf.setText(tf.getText().concat("."));
		
		if(e.getSource() == bAdd) {
			v1 = Double.parseDouble(tf.getText());  
			tf.setText(tf.getText().concat(" + "));
			op = 1;
		}
		if(e.getSource() == bSub) {
			v1 = Double.parseDouble(tf.getText());  
			tf.setText(tf.getText().concat(" - "));
			op = 2;
		}
		if(e.getSource() == bDiv) {
			v1 = Double.parseDouble(tf.getText());  
			tf.setText(tf.getText().concat(" / "));
			op = 3;
		}
		if(e.getSource() == bPro) {
			v1 = Double.parseDouble(tf.getText());  
			tf.setText(tf.getText().concat(" * "));
			op = 4;
		}
		if(e.getSource() == bEq) {
			
			String str = tf.getText();
			String[] arr = str.split("\\s");
			v2 = Double.parseDouble(arr[2]);
			
			switch(op) {
			case 1:
				res = v1 + v2;
				break;
			case 2:
				res = v1 - v2;
				break;
			case 3:
				res = v1 / v2;
				break;
			case 4:
				res = v1 * v2;
				break;
			}
			tf.setText("" + res);
		}
		if(e.getSource() == bClr)
			tf.setText("");
		if(e.getSource() == bBck) {
			String s = tf.getText();
			tf.setText("");
			for(int i = 0;i<s.length()-1;i++) {
				tf.setText(tf.getText() + s.charAt(i));
			}
		}		
	}
}
