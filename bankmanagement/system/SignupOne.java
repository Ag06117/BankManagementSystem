package bankmanagement.system;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener 
   
{

    long random;
    JTextField nametextfield,fnametextfield,emailtextfield,Addresstextfield,citytextfield,pintextfield,statetextfield;
    JButton next;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser datechooser;
    
    
    
     SignupOne() {
         setLayout(null);
         
         
        Random ran = new Random();
          random = Math.abs(ran.nextLong() % 9000L )+ 1000L;          
         
          
        JLabel formno = new JLabel("APPLICATION FROM NO." + random );
           formno.setFont(new Font("Montserrat", Font.BOLD, 38));
           formno.setBounds(140,20,600,40);
           add(formno);
           
        JLabel pd = new JLabel("Page 1:Personal Details" );
           pd.setFont(new Font("Montserrat", Font.BOLD, 22));
           pd.setBounds(290,80,400,30);
           add(pd);
           
         JLabel name = new JLabel("Name:");
           name.setFont(new Font("Montserrat", Font.BOLD, 20));
           name.setBounds(100,140,100,30);
           add(name);
           
         nametextfield = new JTextField();
         nametextfield.setFont(new Font("Montserrat", Font.BOLD, 14));  
         nametextfield.setBounds(300, 140, 400, 30);
         add(nametextfield);
         
         
         JLabel fname = new JLabel("Father's Name:");
           fname.setFont(new Font("Montserrat", Font.BOLD, 20));
           fname.setBounds(100,190,200,30);
           add(fname);   
           
         fnametextfield = new JTextField();
         fnametextfield.setFont(new Font("Montserrat", Font.BOLD, 14));  
         fnametextfield.setBounds(300, 190, 400, 30);
         add(fnametextfield);  
         
         JLabel dob = new JLabel("Date of Birth:");
           dob.setFont(new Font("Montserrat", Font.BOLD, 20));
           dob.setBounds(100,240,200,30);
           add(dob);
        
         datechooser = new JDateChooser();
         datechooser.setBounds(300, 240, 400, 30);
         datechooser.setForeground(Color.black);
         add(datechooser);
        
         
         
         
        JLabel gender = new JLabel("Gender:");
           gender.setFont(new Font("Montserrat", Font.BOLD, 20));
           gender.setBounds(100,290,200,30);
           add(gender); 
        
        
       
        
        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.white);
        add(male);
        female = new JRadioButton("Female");  
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.white);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);  
        
         
        JLabel email = new JLabel("Email Address:");
           email.setFont(new Font("Montserrat", Font.BOLD, 20));
           email.setBounds(100,340,200,30);
           add(email);    
           
         emailtextfield = new JTextField();
         emailtextfield.setFont(new Font("Montserrat", Font.BOLD, 14));  
         emailtextfield.setBounds(300, 340, 400, 30);
         add(emailtextfield);   
         
        JLabel martial = new JLabel("Martial Status:");
           martial.setFont(new Font("Montserrat", Font.BOLD, 20));
           martial.setBounds(100,390,200,30);
           add(martial);   
           
        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.white);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");  
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        
        other = new JRadioButton("Other");  
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.white);
        add(other);
        ButtonGroup martialgroup = new ButtonGroup();
        martialgroup.add(married);
        martialgroup.add(unmarried);    
        martialgroup.add(other);     
        
           
           
        JLabel Address = new JLabel("Address:");
           Address.setFont(new Font("Montserrat", Font.BOLD, 20));
           Address.setBounds(100,440,200,30);
           add(Address);
           
         Addresstextfield = new JTextField();
         Addresstextfield.setFont(new Font("Montserrat", Font.BOLD, 14));  
         Addresstextfield.setBounds(300, 440, 400, 30);
         add(Addresstextfield);     
         
        JLabel city = new JLabel("City:");
           city.setFont(new Font("Montserrat", Font.BOLD, 20));
           city.setBounds(100,490,200,30);
           add(city); 
        
         citytextfield = new JTextField();
         citytextfield.setFont(new Font("Montserrat", Font.BOLD, 14));  
         citytextfield.setBounds(300, 490, 400, 30);
         add(citytextfield); 
           
           
        JLabel state = new JLabel("State:");
           state.setFont(new Font("Montserrat", Font.BOLD, 20));
           state.setBounds(100,540,200,30);
           add(state); 
           
         statetextfield = new JTextField();
         statetextfield.setFont(new Font("Montserrat", Font.BOLD, 14));  
         statetextfield.setBounds(300, 540, 400, 30);
         add(statetextfield);    
        
        JLabel pincode = new JLabel("Pin Code:");
           pincode.setFont(new Font("Montserrat", Font.BOLD, 20));
           pincode.setBounds(100,590,200,30);
           add(pincode);    
        
         pintextfield = new JTextField();
         pintextfield.setFont(new Font("Montserrat", Font.BOLD, 14));  
         pintextfield.setBounds(300, 590, 400, 30);
         add(pintextfield);
        
        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Montserrat", Font.BOLD, 14)); 
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
         
         
      getContentPane().setBackground(Color.white);
      
      setSize(850,800);  
      setLocation(350, 10);
      setVisible(true);
      
    }
    
    public void actionPerformed(ActionEvent ae) {
       String formno = "" + random;  //long
       String name = nametextfield.getText();
       String fname = fnametextfield.getText();
       String dob =((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
       String gender = null;
       if(male.isSelected()){
           gender = "Male";
       }
       else if(female.isSelected()){
           gender = "Female"; 
       }
       String email = emailtextfield.getText();
       String marital = null;
       if(married.isSelected()){
           marital = "Married";
       }
       else if(unmarried.isSelected()){
           marital = "Unmarried";
       }
       else if (other.isSelected()){
           marital = "Other";
       }
       
       String address = Addresstextfield.getText();
      String city = citytextfield.getText();
      String state = statetextfield.getText();
      String pin = pintextfield.getText();
       
      
        try {
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is Required");
            }else{
                Conn c = new Conn();
String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";

                c.s.executeUpdate(query);
            
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public static void main(String[] args) {
        new SignupOne();
    }
    
}
