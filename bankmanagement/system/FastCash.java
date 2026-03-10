package bankmanagement.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;



public class FastCash extends JFrame implements ActionListener{

    JButton deposit, cashWithdraw, fastCash, miniStatement, pinChange, balanceEnquiry, exit;
    String pinnumber;
    FastCash(String pinnumber) {
        this.pinnumber = pinnumber;
        
        
        setSize(900, 900);
        setLocation(300, 0);
        setLayout(null);
      

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("SELECT WITHDRAW AMOUNT");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.white);
        text.setFont(new Font("Montserrat", Font.BOLD, 18));
        image.add(text);

        deposit = new JButton("RS 100");
        deposit.setBounds(170, 415, 150, 30);
        deposit.addActionListener(this);
        image.add(deposit);

        cashWithdraw = new JButton("RS 500");
        cashWithdraw.setBounds(355, 415, 150, 30);
        cashWithdraw.addActionListener(this);
        image.add(cashWithdraw);

        fastCash = new JButton("RS 1000");
        fastCash.setBounds(170, 450, 150, 30);
        fastCash.addActionListener(this);
        image.add(fastCash);

        miniStatement = new JButton("RS 2000");
        miniStatement.setBounds(355, 450, 150, 30);
        miniStatement.addActionListener(this);
        image.add(miniStatement);

        pinChange = new JButton("RS 5000");
        pinChange.setBounds(170, 485, 150, 30);
        pinChange.addActionListener(this);
        image.add(pinChange);

        balanceEnquiry = new JButton("RS 10000");
        balanceEnquiry.setBounds(355, 485, 150, 30);
        balanceEnquiry.addActionListener(this);
        image.add(balanceEnquiry);

        exit = new JButton("BACK");
        exit.setBounds(355, 520, 150, 30);
        exit.addActionListener(this);
        image.add(exit);

        setVisible(true);
    }

    
    public  void actionPerformed(ActionEvent ae){
        if (ae.getSource() == exit){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
        else {
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            Conn c = new Conn();
            try {
             ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
             int balance = 0;
             while(rs.next()){
                 if(rs.getString("type").equals("Deposite")){
                     balance += Integer.parseInt(rs.getString("amount"));
                 } else {
                     balance -= Integer.parseInt(rs.getString("amount"));
                 }
             }
            
             if(ae.getSource() != exit && balance < Integer.parseInt(amount)){
             JOptionPane.showMessageDialog(null, "Insufficient Balance");
             return;
             }
             
             Date date = new Date();
             String query = "insert into bank values ('" + pinnumber + "', '" + date + "','Withdrawl', '" + amount + "')";
             c.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Rs" + amount + " Debited Sucssfully");
             
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
             
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public static void main(String[] args) {
        new FastCash("");
    }
}
