import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener {
JPanel panel;
JButton login , register ;
JLabel nam , pas ;
Color c1,c2,c3;
Font font;
JTextField textField;
JPasswordField passwordField ;

public LoginPage (){

super("My Final Project ");
this.setSize(800,650);

c1 = new Color(255,255,255);
c2 = new Color(249,190,53);
c3 = new Color(0,0,0);

font = new Font("Arial",Font.BOLD,28);

panel = new JPanel();

panel.setLayout(null);
panel.setBackground(c2);


textField = new JTextField("");
textField.setBounds(400,150,100,50);
panel.add(textField);

passwordField = new JPasswordField("");
passwordField.setBounds(400,220,100,50);
panel.add(passwordField);

nam =  new JLabel("NAME");
nam.setBounds(280,150,100,50);
nam.setFont(font);
nam.setForeground(c3);
panel.add(nam);

pas = new JLabel("PASSWORD");
pas.setBounds(220,220,200,50);
pas.setFont(font);
pas.setForeground(c3);
panel.add(pas);


login = new JButton("LOGIN");
login.setBounds(150,350,150,50);
login.setFont(font);
login.setBackground(c3);
login.setForeground(c1);
login.addActionListener(this);
panel.add(login);


register = new JButton("REGISTER");
register.setBounds(350,350,200,50);
register.setFont(font);
register.setBackground(c3);
register.setForeground(c1);
register.addActionListener(this);
panel.add(register);






this.add(panel);
    
}

public void actionPerformed(ActionEvent ae) {
   if (ae.getSource()==register) {
Register register = new Register();
register.setVisible(true);
this.setVisible(false);
    
   }else if (ae.getSource()==login){

String n = textField.getText();
String p = passwordField.getText();

Account account = new Account();

if (account.getAccount(n, p)==true) {
JOptionPane.showMessageDialog(null,"Login successfull");

    QuizPage1 quizPage1 = new QuizPage1();

    quizPage1.setVisible(true);
    this.setVisible(false);
}else{

    JOptionPane.showMessageDialog(null,"Worng user name or Password");
}


   }



}





}