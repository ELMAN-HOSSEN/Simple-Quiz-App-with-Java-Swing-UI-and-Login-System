import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizPage5 extends JFrame implements ActionListener {
JPanel panel;
JButton next ,op1,op2,op3,op4;
JLabel qus ;
Color c1,c2,c3;
Font font;



public QuizPage5 (){

super("QUESTION NUMBER 5 ");
this.setSize(800,650);

c1 = new Color(255,255,255);
c2 = new Color(249,190,53);
c3 = new Color(0,0,0);

font = new Font("Arial",Font.BOLD,28);

panel = new JPanel();

panel.setLayout(null);
panel.setBackground(c2);


qus = new JLabel("A abstract class must have a: ");
qus.setBounds(50,50,800,50);

qus.setFont(font);

panel.add(qus);


op1 = new JButton("Child class.");
op1.setBounds(100,150,500,50);
op1.addActionListener(this);
panel.add(op1);

op2 = new JButton("Parent class.");
op2.setBounds(100,220,500,50); 
op2.addActionListener(this);
panel.add(op2);

op3 = new JButton("Super class.");
op3.setBounds(100,290,500,50);
op3.addActionListener(this);
panel.add(op3);

op4 = new JButton("None of them");
op4.setBounds(100,360,500,50);
op4.addActionListener(this);
panel.add(op4);

next = new JButton("Next");
next.setBounds(650,450,100,50);
next.addActionListener(this);
next.setBackground(c1);
panel.add(next);




this.add(panel);
    
}

public void actionPerformed(ActionEvent ae) {
   
if (ae.getSource()==op1) {
    
    op1.setBackground(Color.GREEN);
}else if (ae.getSource()==op2) {
    
    op2.setBackground(Color.RED);
}else if (ae.getSource()==op3) {
    
    op3.setBackground(Color.RED);
}else if (ae.getSource()==op4) {
    
    op4.setBackground(Color.RED);
}else if (ae.getSource()==next){

LoginPage loginPage = new LoginPage();
this.setVisible(false);
loginPage.setVisible(true);

    
}


}





}