package bankmanagement.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JButton login, signup, clear;
    JTextField cardIn;
    JPasswordField PINIn;

    Login() {
        setTitle("Automated Teller Machine");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        JLabel t1 = new JLabel("Welcome to ATM");
        t1.setBounds(200, 40, 400, 40);
        t1.setFont(new Font("Montserrat", Font.BOLD, 38));
        add(t1);

        JLabel cardno = new JLabel("Card NO: ");
        cardno.setBounds(120, 150, 150, 40);
        cardno.setFont(new Font("Montserrat", Font.BOLD, 28));
        add(cardno);

        cardIn = new JTextField();
        cardIn.setBounds(300, 150, 250, 30);
        cardIn.setFont(new Font("Montserrat", Font.BOLD, 15));
        add(cardIn);

        JLabel pin = new JLabel("PIN");
        pin.setBounds(120, 220, 250, 40);
        pin.setFont(new Font("Montserrat", Font.BOLD, 28));
        add(pin);

        PINIn = new JPasswordField();
        PINIn.setBounds(300, 220, 250, 30);
        PINIn.setFont(new Font("Montserrat", Font.BOLD, 15));
        add(PINIn);

        login = new JButton("SIGN-IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN-UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.white);

        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {
            cardIn.setText("");
            PINIn.setText("");
        } else if (ae.getSource() == login) {
            Conn conn = new Conn();
            String cardnumber = cardIn.getText();
            String pinnumber = new String(PINIn.getPassword()); 

            String query = "select * from login where cardnumber = '" + cardnumber + "' and pin = '" + pinnumber + "'";

            try {
                ResultSet rs = conn.s.executeQuery(query);
                if (rs.next()) {
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true); 
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (ae.getSource() == signup) {
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
