import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Register extends JFrame implements ActionListener {
JPanel panel;
JButton  register,back ;
JLabel nam , pas,notice ;
Color c1,c2,c3;
Font font;
JTextField textField;
JPasswordField passwordField ;

public Register (){

super("Registration ");
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

notice = new JLabel("Enter your name a password ");

notice.setBounds(50,50,400,50);
panel.add(notice);

pas = new JLabel("PASSWORD");
pas.setBounds(220,220,200,50);
pas.setFont(font);
pas.setForeground(c3);
panel.add(pas);





register = new JButton("REGISTER");
register.setBounds(150,350,200,50);
register.setFont(font);
register.setBackground(c3);
register.setForeground(c1);
register.addActionListener(this);
panel.add(register);

back = new JButton("BACK");
back.setBounds(380,350,150,50);
back.setFont(font);
back.setBackground(c3);
back.setForeground(c1);
back.addActionListener(this);
panel.add(back);






this.add(panel);
    
}

public void actionPerformed(ActionEvent ae) {
   
if (ae.getSource()==register) {

    String n = textField.getText();
    String p = passwordField.getText();

    if (!n.isEmpty()|| !p.isEmpty()) {

        Account user = new Account(n,p);

        user.addaccount();

        LoginPage lg = new LoginPage();

        lg.setVisible(true);
        this.setVisible(false);
        
    }else{

notice.setText("Please enter All details!!");

    }
    
}else if (ae.getSource()==back) {
    LoginPage lg = new LoginPage();

        lg.setVisible(true);
        this.setVisible(false);
}


}





}