import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.io.FileWriter;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
/*
 *                    BULE HORA UNIVERSITY
 *                   COLLAGE OF INFORMATICS
 *             DEPARTEMENT OF SOFTWARE ENGINEERING
 *        ASSIGNMENT FOR MOBILE APPLICATION DEVELOPMENT
 *           TITLE: SIMPLE REGISTRATION FORM BY SWING
 *
 *               NAME: Lelisa shashura
 *                 ID : ru-0976/12
 *
 * */
public class RegistrationForm extends JFrame{
    private final JButton back;
    private  JComboBox year;
    private  JComboBox month;
    private  JComboBox date;
    private  ButtonGroup gend;
    private  JRadioButton female;
    private  JRadioButton male;
    private  JLabel gender;
    private Double gpa;
    private final JLabel University;
    private JTextField txtuniversity;
    private  JButton buttonRegister;
    private  JButton buttonResit;
    private  JTextField txtlname;
    private  JTextField txtid;
    private  JTextField txtgender;
    private  JTextField txtphone;
    private  JTextField txtgrade;
    private  JTextField txtcoll;
    private  JTextField txtdepart;
    private  JLabel Departement;
    private  JLabel Collage;
    private  JLabel Years;
    private  JLabel Grade;
    private  JLabel Phone;
    private  JLabel IdNumber;
    private  JLabel Lastname;
    private  JLabel Fristname;
    private  Container content;
    private  JLabel title;
    private  JTextField txtfname;
    private String days[]={"1","2","3","4","5","6","7","8","9","10","11","12",
            "13","14","15","16","17","18",
            "19","20","21","22","23","24","25","26","27","28","29","30"};
    private String months[]
            = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[]
            = { "2010", "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019","2020","2021","2022"};
    RegistrationForm() {
        setBackground(Color. RED);
        setBounds(0, 0, 800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        content= getContentPane();
        content.setLayout(null);
        title = new JLabel("Registration Form");
        title.setForeground(Color.green);
        title.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        title.setSize(300, 45);
        title.setLocation(300, 10);
        content.add(title);

        Fristname = new JLabel("First Name");
        Fristname.setFont(new Font("Times New Roman", Font.BOLD, 28));
        Fristname.setBackground(Color.ORANGE);
        Fristname.setSize(150, 20);
        Fristname.setLocation(150, 100);
        Fristname.setForeground (Color.BLACK);
        content.add(Fristname);

        txtfname = new JTextField();
        txtfname.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        txtfname.setSize(190, 30);
        txtfname.setLocation(350, 100);
        content.add(txtfname);

        Lastname = new JLabel("Last Name");
        Lastname.setFont(new Font("Times New Roman", Font.BOLD, 28));
        Lastname.setBackground(Color.ORANGE);
        Lastname.setForeground (Color.BLACK);
        Lastname.setSize(150, 20);
        Lastname.setLocation(150, 150);

        content.add(Lastname);

        txtlname = new JTextField();
        txtlname.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        txtlname.setSize(190, 30);
        txtlname.setLocation(350, 150);
        content.add(txtlname);

        IdNumber = new JLabel("Id Number");
        IdNumber.setFont(new Font("Times New Roman", Font.BOLD, 28));
        IdNumber.setBackground(Color.ORANGE);
        IdNumber.setForeground (Color.BLACK);
        IdNumber.setSize(150, 20);
        IdNumber.setLocation(150, 200);
        content.add(IdNumber);

        txtid = new JTextField();
        txtid.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        txtid.setSize(190, 30);
        txtid.setLocation(350, 200);
        content.add(txtid);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Times New Roman", Font.BOLD, 28));
        gender.setBackground(Color.ORANGE);
        gender.setSize(150, 20);
        gender.setForeground (Color.BLACK);
        gender.setLocation(150, 250);
        content.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        male.setSize(100, 20);
        male.setLocation(350, 250);
        content.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        female.setSize(100, 20);
        female.setLocation(450, 250);
        content.add(female);

        gend= new ButtonGroup();
        gend.add(male);
        gend.add(female);

        Phone = new JLabel("Phone");
        Phone.setFont(new Font("Times New Roman", Font.BOLD, 28));
        Phone.setBackground(Color.ORANGE);
        Phone.setForeground (Color.BLACK);
        Phone.setSize(150, 20);
        Phone.setLocation(150, 300);
        content.add(Phone);

        txtphone = new JTextField();
        txtphone.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        txtphone.setSize(190, 30);
        txtphone.setLocation(350, 300);
        content.add(txtphone);

        Grade = new JLabel("Cumulative GPA");
        Grade.setFont(new Font("Times New Roman", Font.BOLD, 28));
        Grade.setBackground(Color.ORANGE);
        Grade.setForeground (Color.BLACK);
        Grade.setSize(200, 20);
        Grade.setLocation(150, 350);
        content.add(Grade);

        txtgrade = new JTextField();
        txtgrade.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        txtgrade.setSize(190, 30);
        txtgrade.setLocation(350, 350);
        content.add(txtgrade);

        Years = new JLabel("Academic Year");
        Years.setFont(new Font("Times New Roman", Font.BOLD, 28));
        Years.setBackground(Color.ORANGE);
        Years.setSize(200, 20);
        Years.setForeground (Color.BLACK);
        Years.setLocation(150, 400);
        content.add(Years);

        date = new JComboBox(days);
        date.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        date.setSize(50, 30);
        date.setLocation(350, 400);
        content.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        month.setSize(60, 30);
        month.setLocation(400, 400);
        content.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        year.setSize(60, 30);
        year.setLocation(460, 400);
        content.add(year);


        Collage = new JLabel("Collage");
        Collage.setFont(new Font("Times New Roman", Font.BOLD, 28));
        Collage.setBackground(Color.ORANGE);
        Collage.setForeground (Color.BLACK);
        Collage.setSize(150, 30);
        Collage.setLocation(150, 450);
        content.add(Collage);

        txtcoll = new JTextField();
        txtcoll.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        txtcoll.setSize(190, 30);
        txtcoll.setLocation(350, 450);
        content.add(txtcoll);

        Departement = new JLabel("Departement");
        Departement.setFont(new Font("Times New Roman", Font.BOLD, 28));
        Departement.setBackground(Color.ORANGE);
        Departement.setSize(150, 30);
        Departement.setForeground (Color.BLACK);
        Departement.setLocation(150, 500);
        content.add(Departement);

        txtdepart = new JTextField();
        txtdepart.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        txtdepart.setSize(190, 30);
        txtdepart.setLocation(350, 500);
        txtdepart.setEditable(false);
        content.add(txtdepart);

        University = new JLabel("University");
        University.setFont(new Font("Times New Roman", Font.BOLD, 28));
        University.setBackground(Color.ORANGE);
        University.setSize(150, 30);
        University.setForeground (Color.BLACK);
        University.setLocation(150, 550);
        content.add(University);

        txtuniversity = new JTextField();
        txtuniversity.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        txtuniversity.setSize(190, 30);
        txtuniversity.setLocation(350, 550);
        content.add(txtuniversity);

        back = new JButton("BACK_TO_MENU");
        back.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        back.setSize(210, 40);
        back.setLocation(100, 600);
        back.setForeground(Color.black);
        back.setBackground(Color.ORANGE);
        content.add(back);

        buttonRegister = new JButton("REGISTER");
        buttonRegister.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        buttonRegister.setSize(175, 40);
        buttonRegister.setBackground(Color.yellow);
        buttonRegister.setForeground(Color.black);
        buttonRegister.setLocation(380, 600);
        content.add(buttonRegister);

        buttonResit = new JButton("CLEAR");
        buttonResit.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        buttonResit.setSize(150, 40);
        buttonResit.setBackground(Color.PINK);
        buttonResit.setForeground(Color.black);
        buttonResit.setLocation(600, 600);
        content.add(buttonResit);
        setVisible(true);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                ConnectionClass instance= new ConnectionClass();
            }
        });
        buttonResit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               if (txtcoll.getText().isEmpty() &&txtdepart.getText().isEmpty()&&txtuniversity.getText().isEmpty()&&txtgrade.getText().isEmpty() &&
                       txtid.getText().isEmpty()&&txtfname.getText().isEmpty()&&txtlname.getText().isEmpty()&&txtphone.getText().isEmpty()){
                   JOptionPane.showMessageDialog(null, "nothing to reset!!!!!!!!!!!!");
                   return ;
               }else {
                   txtcoll.setText(null);
                   txtdepart.setText(null);
                   txtuniversity.setText(null);
                   male.setSelected(false);
                   female.setSelected(false);
                   txtgrade.setText(null);
                   txtid.setText(null);
                   txtfname.setText(null);
                   txtlname.setText(null);
                   txtphone.setText(null);
               }
            }
        });

        buttonRegister.addActionListener(new ActionListener() {
            public String departement;
            public String gender;
            public String validletter= "^[A-Za-z]+$";
            public String validUni="^[\\p{L} .'-]{3,50}+$";
            public String validnumber="^[0-9]*$";
            @Override
            public void actionPerformed(ActionEvent e) {

                String grade = txtgrade.getText().toString();
                if (grade.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "please write your cumulative gpa");
                    return ;
                } else if (grade.matches(validletter)) {
                    JOptionPane.showMessageDialog(null, "please write your cumulative gpa in number only");
                    return;
                } else{
                    gpa = Double.parseDouble(String.valueOf(grade));
                }

                if(gpa < 1 || gpa >4){
                    JOptionPane.showMessageDialog(null, "invalid grade please enter correct one");
                    return;
                }

                if (male.isSelected()){
                    gender="male";
                } else if (female.isSelected()) {
                    gender="female";
                }else{
                    JOptionPane.showMessageDialog(null, "please select your sex");
                    return ;
                }
                String fname=txtfname.getText();
                String lname=txtlname.getText();
                String id=txtid.getText();
                String coll=txtcoll.getText();
                String uni=txtuniversity.getText();
                String phone=txtphone.getText();

                if (fname.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "please write your frist name");
                    return ;
                } else if (!fname.matches(validletter)) {
                    JOptionPane.showMessageDialog(null, "please write your frist name in character only");
                    return ;
                } else if(fname.length() <3 || fname.length() >20){
                    JOptionPane.showMessageDialog(null, "length should be between 3 to 20");
                    return ;
                } else if (lname.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "please write your last name");
                    return;
                } else if (!lname.matches(validletter)) {
                    JOptionPane.showMessageDialog(null, "please write your last name in character only");
                    return;
                } else if(lname.length() <3 || lname.length() >20){
                    JOptionPane.showMessageDialog(null, "length should be between 3 to 20");
                    return ;
                }else if (phone.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "please write your phone number");
                    return;
                } else if (!phone.matches(validnumber)) {
                    JOptionPane.showMessageDialog(null, "please write your phone in number only");
                    return;
                } else if (phone.indexOf("09")!=0) {
                    JOptionPane.showMessageDialog(null, "please write your phone in format way");
                    return;
                } else if (phone.length() <10 || phone.length() >10) {
                    JOptionPane.showMessageDialog(null, "please write your phone in valid length");
                    return;
                } else if (id.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "please write your id number");
                    return;
                } else if(id.length() <3 || id.length() >20){
                    JOptionPane.showMessageDialog(null, "length should be between 3 to 20");
                    return ;
                } else if (!(id.matches(validnumber) || id.matches(validletter))) {
                    JOptionPane.showMessageDialog(null, "write your id in number or character");
                    return ;
                }  else if (coll.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "please write your collage");
                    return;
                } else if (!coll.matches(validletter)) {
                    JOptionPane.showMessageDialog(null, "please write your collage in character only");
                    return;
                }else if(coll.length() <3 || coll.length() >20){
                    JOptionPane.showMessageDialog(null, "length should be between 3 to 20");
                    return ;
                } else if (uni.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "please write your university");
                    return;
                } else if (!uni.matches(validUni)) {
                    JOptionPane.showMessageDialog(null, "please write your university name in character only");
                    return;
                } else if(uni.length() <3 || uni.length() >20){
                    JOptionPane.showMessageDialog(null, "length should be between 3 to 20");
                    return ;
                }else {
                    if (gpa < 3.0) {
                        txtdepart.setText("");
                        JOptionPane.showMessageDialog(null, "you can't register for informatics collage !!!!!!!!!!!!!");
                        return;
                    } else if (gpa >= 3.0 && gpa <= 3.2) {
                        departement="Information Science";
                        txtdepart.setText("Information science");

                        try {
                            FileWriter fileWriter= new FileWriter("C:\\Users\\lelisa\\Desktop\\Assignment\\IS.txt",true);
                            fileWriter.write("Frist Name :"+fname+"\n");
                            fileWriter.write("Last Name :"+lname+"\n");
                            fileWriter.write("Phone Number :"+phone+"\n");
                            fileWriter.write("Academic year :"+(String)date.getSelectedItem()+"/"+(String)month.getSelectedItem()+"/"+(String)year.getSelectedItem()+"\n");
                            fileWriter.write("Id number :"+id+"\n");
                            fileWriter.write("Gemnder  :"+gender+"\n");
                            fileWriter.write("Departement :"+departement+"\n");
                            fileWriter.write("Collage :"+coll+"\n");
                            fileWriter.write("University :"+uni+"\n");
                            fileWriter.write("====================================\n");
                            fileWriter.close();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);

                        }

                        JOptionPane.showMessageDialog(null, "YOU REGISTERED FOR IS");
                    } else if (gpa > 3.2 && gpa <= 3.4) {
                        departement="Information technology";
                        txtdepart.setText("Information technology");

                        try {
                            FileWriter fileWriter= new FileWriter("C:\\Users\\lelisa\\Desktop\\Assignment\\IT.txt",true);
                            fileWriter.write("Frist Name :"+fname+"\n");
                            fileWriter.write("Last Name :"+lname+"\n");
                            fileWriter.write("Phone Number :"+phone+"\n");
                            fileWriter.write("Academic year :"+(String)date.getSelectedItem()+"/"+(String)month.getSelectedItem()+"/"+(String)year.getSelectedItem()+"\n");
                            fileWriter.write("Id number :"+id+"\n");
                            fileWriter.write("Gemnder  :"+gender+"\n");
                            fileWriter.write("Departement :"+departement+"\n");
                            fileWriter.write("Collage :"+coll+"\n");
                            fileWriter.write("University :"+uni+"\n");
                            fileWriter.write("====================================\n");
                            fileWriter.close();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);

                        }

                        JOptionPane.showMessageDialog(null, "YOU REGISTERED FOR IT");
                    } else if (gpa > 3.4 && gpa <= 3.6) {
                        departement="computer science";
                        txtdepart.setText("computer science");

                        try {
                            FileWriter fileWriter= new FileWriter("C:\\Users\\lelisa\\Desktop\\Assignment\\CS.txt",true);
                            fileWriter.write("Frist Name :"+fname+"\n");
                            fileWriter.write("Last Name :"+lname+"\n");
                            fileWriter.write("Phone Number :"+phone+"\n");
                            fileWriter.write("Academic year :"+(String)date.getSelectedItem()+"/"+(String)month.getSelectedItem()+"/"+(String)year.getSelectedItem()+"\n");
                            fileWriter.write("Id number :"+id+"\n");
                            fileWriter.write("Gemnder  :"+gender+"\n");
                            fileWriter.write("Departement :"+departement+"\n");
                            fileWriter.write("Collage :"+coll+"\n");
                            fileWriter.write("University :"+uni+"\n");
                            fileWriter.write("====================================\n");
                            fileWriter.close();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);

                        }

                        JOptionPane.showMessageDialog(null, "YOU REGISTERED FOR CS");
                    } else if (gpa > 3.6 && gpa <= 4.0) {
                        departement="software engineering";
                        txtdepart.setText("software engineering");

                        try {
                            FileWriter fileWriter= new FileWriter("C:\\Users\\lelisa\\Desktop\\Assignment\\SW.txt",true);
                            fileWriter.write("Frist Name :"+fname+"\n");
                            fileWriter.write("Last Name :"+lname+"\n");
                            fileWriter.write("Phone Number :"+phone+"\n");
                            fileWriter.write("Academic year :"+(String)date.getSelectedItem()+"/"+(String)month.getSelectedItem()+"/"+(String)year.getSelectedItem()+"\n");
                            fileWriter.write("Id number :"+id+"\n");
                            fileWriter.write("Gemnder  :"+gender+"\n");
                            fileWriter.write("Departement :"+departement+"\n");
                            fileWriter.write("Collage :"+coll+"\n");
                            fileWriter.write("University :"+uni+"\n");
                            fileWriter.write("====================================\n");
                            fileWriter.close();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);

                        }

                        JOptionPane.showMessageDialog(null, "YOU REGISTERED FOR SW");
                    } else {
                        JOptionPane.showMessageDialog(null, "invalid grade!!!!!!");
                    }

                }
            }
        });
    }
    public static void main(String[] args) {

        RegistrationForm registrationForm= new RegistrationForm();
    }
}


