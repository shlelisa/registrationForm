import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class ConnectionClass extends JFrame {
    private final Container content;
    private final JLabel title;
    private final JLabel ask1;
    private final JLabel ask2;
    private final JButton btnRegister;
    private JLabel ask;
    private final JTextField txtask;


    ConnectionClass(){
        setTitle("Registration Form");
        setBounds(300, 0, 600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        content= getContentPane();
        content.setLayout(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        title.setSize(300, 45);
        title.setLocation(30, 10);
        content.add(title);

        ask = new JLabel("Enter your choice");
        ask.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        ask.setSize(300, 40);
        ask.setLocation(100, 100);
        content.add(ask);

        ask1 = new JLabel("1: for register new student");
        ask1.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        ask1.setSize(300, 40);
        ask1.setLocation(120, 150);
        content.add(ask1);

        ask2 = new JLabel("2: for viewing registered student");
        ask2.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        ask2.setSize(380, 40);
        ask2.setLocation(120, 200);
        content.add(ask2);

        txtask = new JTextField();
        txtask.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        txtask.setSize(190, 30);
        txtask.setLocation(140, 250);
        content.add(txtask);

        btnRegister=new JButton("CLICK HERE");
        btnRegister.setFont(new Font("Times New Roman",Font.PLAIN,20));
        btnRegister.setSize(200,30);
        btnRegister.setForeground(Color.black);
        btnRegister.setBackground(Color.CYAN);
        btnRegister.setLocation(200,350);
        content.add(btnRegister);

        setVisible(true);

        btnRegister.addActionListener(new ActionListener() {
            int number;
            String validNumber="^[0-9]*$";
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtask.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"please select one");
                    return;
                } else if (!txtask.getText().matches(validNumber)) {
                    JOptionPane.showMessageDialog(null,"please insert number only");
                    return;
                }else {
                    number=Integer.parseInt(txtask.getText().toString());
                }if(number < 1 || number >2){
                    JOptionPane.showMessageDialog(null,"please insert number 1 or 2");
                    return;
                }
                if (number==1){
                    setVisible(false);
                    RegistrationForm instance = new RegistrationForm();
                } else if (number==2) {
                    setVisible(false);
                    ViewDataFromFile instance= new ViewDataFromFile();

                }
            }
        });
    }
    public static void main(String[] args){
        ConnectionClass obj= new ConnectionClass();
    }
}

