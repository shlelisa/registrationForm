import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
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
public class ViewDataFromFile extends JFrame {
    private final JLabel ask;
    private final JButton back;
    private final JTextArea textarea;
    private final JScrollPane scroll;
    private JTextField txtView;
    private Container con;
    private JLabel titlev;
    private JLabel is;
    private static int number;
    private JLabel it;
    private JButton btnview;
    private JLabel sw;
    private JLabel cs;
    ViewDataFromFile(){
        setTitle("Registration Form");
        setBounds(100, 0, 600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        con= getContentPane();
        con.setLayout(null);

        titlev = new JLabel("Registration Form");
        titlev.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        titlev.setSize(300, 45);
        titlev.setLocation(30, 10);
        con.add(titlev);


        textarea = new JTextArea(10,100);
        textarea.setLocation(500,100);
        textarea.setSize(500,400);
        textarea.setVisible(true);
        con.add(textarea);

        scroll = new JScrollPane(textarea);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        con.add(scroll);


        ask = new JLabel("Enter your choice");
        ask.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        ask.setSize(300, 40);
        ask.setLocation(100, 100);
        con.add(ask);

        is = new JLabel("1:View data of IS student");
        is.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        is.setSize(300, 40);
        is.setLocation(120, 150);
        con.add(is);

        it = new JLabel("2:View data of IT student");
        it.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        it.setSize(380, 40);
        it.setLocation(120, 200);
        con.add(it);
        cs = new JLabel("3:View data of CS student");
        cs.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        cs.setSize(380, 40);
        cs.setLocation(120, 250);
        con.add(cs);
        sw = new JLabel("4:View data of SW student");
        sw.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        sw.setSize(380, 40);
        sw.setLocation(120, 300);
        con.add(sw);

        txtView = new JTextField();
        txtView.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        txtView.setSize(190, 30);
        txtView.setLocation(140, 350);
        con.add(txtView);

        back = new JButton("BACK_TO_MENU");
        back.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        back.setSize(210, 30);
        back.setBackground(Color.ORANGE);
        back.setForeground(Color.black);
        back.setLocation(50, 420);
        con.add(back);

        btnview=new JButton("VIEW DATA");
        btnview.setFont(new Font("Times New Roman",Font.PLAIN,20));
        btnview.setSize(200,30);
        btnview.setBackground(Color.PINK);
        btnview.setForeground(Color.black);
        btnview.setLocation(300,420);
        con.add(btnview);

        setVisible(true);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                ConnectionClass instance= new ConnectionClass();
            }
        });
        btnview.addActionListener(new ActionListener() {

            String validNumber="^[0-9]*$";
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtView.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "please select one");
                        return;
                    } else if (!txtView.getText().matches(validNumber)) {
                        JOptionPane.showMessageDialog(null, "please insert number only");
                        return;
                    } else {
                        number = Integer.parseInt(txtView.getText().toString());
                    }
                    if (number < 1 || number > 4) {
                        JOptionPane.showMessageDialog(null, "please insert number between 1 to 4");
                        return;
                    } else if (number == 1) {

                        try {
                            FileReader fileReader = new FileReader("C:\\Users\\lelisa\\Desktop\\Assignment\\IS.txt");
                            int ch;
                            while ((ch = fileReader.read()) != -1) {
                                System.out.print((char) ch);

                            }
                            fileReader.close();
                        } catch (IOException ex) {
                            //  throw new RuntimeException(ex);
                            JOptionPane.showMessageDialog(null, "this file is not created, please create it first");
                            return;
                        }

                    } else if (number == 2) {
                        try {
                            FileReader fileReader = new FileReader("C:\\Users\\lelisa\\Desktop\\Assignment\\IT.txt");
                            int ch;
                            while ((ch = fileReader.read()) != -1) {
                                System.out.print((char) ch);

                            }
                            fileReader.close();
                        } catch (IOException ex) {
                            //throw new RuntimeException(ex);
                            JOptionPane.showMessageDialog(null, "this file is not created, please create it first");
                            return;
                        }
                    } else if (number == 3) {
                        try {
                            FileReader fileReader = new FileReader("C:\\Users\\lelisa\\Desktop\\Assignment\\CS.txt");

                            int ch;
                            while ((ch = fileReader.read()) != -1) {
                                System.out.print((char) ch);

                            }
                            fileReader.close();
                        } catch (IOException ex) {
                            //throw new RuntimeException(ex);
                            JOptionPane.showMessageDialog(null, "this file is not created, please create it first");
                            return;
                        }
                    } else {
                        try {
                            FileReader fileReader = new FileReader("C:\\Users\\lelisa\\Desktop\\Assignment\\SW.txt");
                            int ch;
                            while ((ch = fileReader.read()) != -1) {
                                System.out.print((char) ch);

                            }
                            fileReader.close();
                        } catch (IOException ex) {
                            //throw new RuntimeException(ex);
                            JOptionPane.showMessageDialog(null, "this file is not created, please create it first");
                            return;
                        }
                    }

            }
        });
    }
    public static void main(String[] args){
        ViewDataFromFile instance= new ViewDataFromFile();
    }
}

