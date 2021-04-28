package flowerOrderProgramProject.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


 
@SuppressWarnings("serial")
public class FlowerLoginView extends JFrame{
    private FlowerMainProgram main;

    // 로그인 실행하는 창
    
    private JButton btnLogin;
    private JPasswordField textpass;
    private JTextField textId;
    private boolean bLoginCheck;
    private JLabel lblLeftImage;
    private JLabel lblRightImage;
    
    public static void main(String[] args) {
    	// 메인클래스 실행
        FlowerMainProgram main = new FlowerMainProgram();
        main.flowerloginView = new FlowerLoginView(); // 로그인창 보이기
        main.flowerloginView.setMain(main); // 로그인창에게 메인 클래스보내기
    }
 
    public FlowerLoginView() {
    	setFont(new Font("Bernard MT Condensed", Font.PLAIN, 12));
      
        setTitle("Manager");
        setSize(870, 456);
        setResizable(false);
        setLocation(800, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       
        JPanel panel = new JPanel();
        placeLoginPanel(panel);
       
        getContentPane().add(panel);
        
        lblLeftImage = new JLabel("");
        lblLeftImage.setIcon(new ImageIcon("C:\\workspace_proj\\flowerOrderProgramProject (8)\\flowerOrderProgramProject\\flowerOrderProgramProject2021\\image\\flower\\flower.JPG"));
        lblLeftImage.setBounds(0, 0, 439, 427);
        panel.add(lblLeftImage);
        
        lblRightImage = new JLabel("");
        lblRightImage.setIcon(new ImageIcon("C:\\workspace_proj\\flowerOrderProgramProject (8)\\flowerOrderProgramProject\\flowerOrderProgramProject2021\\image\\flower\\heart.jpg"));
        lblRightImage.setBounds(415, -13, 539, 1031);
        panel.add(lblRightImage);
       
        setVisible(true);
    	setResizable(false);
    }
   
    public void placeLoginPanel(JPanel panel){
        panel.setLayout(null);     
        JLabel lblid = new JLabel("Manager id");
        lblid.setHorizontalAlignment(SwingConstants.LEFT);
        lblid.setFont(new Font("Gabriola", Font.ITALIC, 20));
        lblid.setForeground(Color.BLACK);
        lblid.setBackground(Color.WHITE);
        lblid.setBounds(470, 25, 128, 25);
        panel.add(lblid);
       
        JLabel lblPass = new JLabel("Password");
        lblPass.setHorizontalAlignment(SwingConstants.LEFT);
        lblPass.setForeground(Color.BLACK);
        lblPass.setFont(new Font("Gabriola", Font.ITALIC, 20));
        lblPass.setBackground(Color.WHITE);
        lblPass.setBounds(470, 94, 99, 25);
        panel.add(lblPass);
       
        textId = new JTextField(20);
        textId.setBounds(470, 54, 212, 30);
        panel.add(textId);
       
        textpass = new JPasswordField(20);
        textpass.setBounds(470, 118, 212, 30);
        panel.add(textpass);
        textpass.addActionListener(new ActionListener() {          
            @Override
            public void actionPerformed(ActionEvent e) {
                isLoginCheck();        
            }
        });
       
        btnLogin = new JButton("Login");
        btnLogin.setBackground(Color.PINK);
        btnLogin.setFont(new Font("Gabriola", Font.ITALIC, 20));
        btnLogin.setBounds(470, 168, 100, 25);
        panel.add(btnLogin);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isLoginCheck();
            }
        });
    }
   
    public void isLoginCheck(){
        if(textId.getText().equals("minruki") && new String(textpass.getPassword()).equals("angel")){
            JOptionPane.showMessageDialog(null, "Success");
            bLoginCheck = true;
           
            FlowerFrm frame = new FlowerFrm();
            frame.setVisible(true);
            dispose();
//            if(isLogin()){
//                main.showFrameTest(); 
//            }                  
        }else{
            JOptionPane.showMessageDialog(null, "Faild");
        }
    }
 
   
    
    public void setMain(FlowerMainProgram main) {
        this.main = main;
    }
   
 
    public boolean isLogin() {     
        return bLoginCheck;
    }
 
}