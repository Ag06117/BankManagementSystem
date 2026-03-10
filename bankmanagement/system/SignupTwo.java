package bankmanagement.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener 
   
{


    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,education,income,occupation;
    String formno;
    
    
     SignupTwo(String formno) {
         
         this.formno = formno;
         
         
         setLayout(null);
         setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
         
       
         
          
        JLabel ad = new JLabel("Page 2:Addtional Details" );
           ad.setFont(new Font("Montserrat", Font.BOLD, 22));
           ad.setBounds(290,80,400,30);
           add(ad);
           
         JLabel name = new JLabel("Relegion:");
           name.setFont(new Font("Montserrat", Font.BOLD, 20));
           name.setBounds(100,140,100,30);
           add(name);
          
           
           String valReligion[] = {"Hindu","Muslim","Sikh","Christan","Other"};
           religion = new JComboBox(valReligion);
           religion.setBounds(300, 140, 400, 30);
           religion.setBackground(Color.white);
           add(religion);
          
         
      
         JLabel fname = new JLabel("Category:");
           fname.setFont(new Font("Montserrat", Font.BOLD, 20));
           fname.setBounds(100,190,200,30);
           add(fname);   
           
           String valcategory[] = {"General","OBC","SC","ST","Other"};
           category = new JComboBox(valcategory);
           category.setBounds(300, 190, 400, 30);
           category.setBackground(Color.WHITE);
           add(category);  
         
         JLabel dob = new JLabel("Income:");
           dob.setFont(new Font("Montserrat", Font.BOLD, 20));
           dob.setBounds(100,240,200,30);
           add(dob);
           
           String valincome[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
           income = new JComboBox(valincome);
           income.setBounds(300, 240, 400, 30);
           income.setBackground(Color.WHITE);
           add(income);  
           

        
         
         
         
           JLabel gender = new JLabel("Educational");
           gender.setFont(new Font("Montserrat", Font.BOLD, 20));
           gender.setBounds(100,290,200,30);
           add(gender);
           
           JLabel email = new JLabel("Qualification:");
           email.setFont(new Font("Montserrat", Font.BOLD, 20));
           email.setBounds(100,315,200,30);
           add(email);  
           
           String EducationValue[] = {"Non-Graduation","Graduation","Post-Gradution","Doctorate","Other"};
           education = new JComboBox(EducationValue);
           education.setBounds(300, 315, 400, 30);
           education.setBackground(Color.WHITE);
           add(education);
           
            
         
        JLabel Occupation = new JLabel("Occupation:");
           Occupation.setFont(new Font("Montserrat", Font.BOLD, 20));
           Occupation.setBounds(100,390,200,30);
           add(Occupation);
           
           String OccupationValue[] = {"Salaried","Self-Employed","Bussiness","Student","Retired","Other"};
           occupation = new JComboBox(OccupationValue);
           occupation.setBounds(300, 390, 400, 30);
           occupation.setBackground(Color.WHITE);
           add(occupation);
           
           
           
        JLabel Pan = new JLabel("Pan Number:");
           Pan.setFont(new Font("Montserrat", Font.BOLD, 20));
           Pan.setBounds(100,440,200,30);
           add(Pan);
           
         pan = new JTextField();
         pan.setFont(new Font("Montserrat", Font.BOLD, 14));  
         pan.setBounds(300, 440, 400, 30);
         add(pan);     
         
        JLabel Aadhar = new JLabel("Aadhar No:");
           Aadhar.setFont(new Font("Montserrat", Font.BOLD, 20));
           Aadhar.setBounds(100,490,200,30);
           add(Aadhar); 
        
         aadhar = new JTextField();
         aadhar.setFont(new Font("Montserrat", Font.BOLD, 14));  
         aadhar.setBounds(300, 490, 400, 30);
         add(aadhar); 
           
           
        JLabel SC = new JLabel("Senoir Citizen:");
           SC.setFont(new Font("Montserrat", Font.BOLD, 20));
           SC.setBounds(100,540,200,30);
           add(SC); 
           
        syes = new JRadioButton("YES");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.white);
        add(syes);
        
        sno = new JRadioButton("NO");  
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.white);
        add(sno);
        
 
        ButtonGroup sgroup = new ButtonGroup();
        sgroup.add(syes);
        sgroup.add(sno);
        
        JLabel pincode = new JLabel("Existing Account:");
           pincode.setFont(new Font("Montserrat", Font.BOLD, 20));
           pincode.setBounds(100,590,200,30);
           add(pincode);    
        
            
        eyes = new JRadioButton("YES");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.white);
        add(eyes);
        
        eno = new JRadioButton("NO");  
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.white);
        add(eno);
        
 
        ButtonGroup egroup = new ButtonGroup();
        egroup.add(eyes);
        egroup.add(eno);  
        
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
       String sreligion = (String)religion.getSelectedItem();
       String scategory = (String)category.getSelectedItem();
       String sincome =(String)income.getSelectedItem();
       String seducation = (String)education.getSelectedItem();
       String soccupation = (String)occupation.getSelectedItem();
       String SC = null;
       if(syes.isSelected()){
           SC = "Yes";
       }
       else if(sno.isSelected()){
           SC = "No"; 
       }
       
       String exisitingacc = null;
       if(eyes.isSelected()){
           exisitingacc = "YEs";
       }
       else if(eno.isSelected()){
           exisitingacc = "No";
       }
       
       String span = pan.getText();
      String saadhar = aadhar.getText();

       
      
        try {
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+SC+"','"+exisitingacc+"')";
                c.s.executeUpdate(query);
                
                //SignUpthree Obj
                setVisible(false);
                new SignupThree(formno).setVisible(true);
               
            }
       catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public static void main(String[] args) {
        new SignupTwo("");
    }
    
} 
