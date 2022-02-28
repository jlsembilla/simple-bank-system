import javax.swing.JFrame;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;
public class login_frm extends JFrame{
    
    JButton loginBtn = new JButton();
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JLabel login_title = new JLabel("Login to your account");
    JPanel pnl = new JPanel();
    public login_frm()
    {
        FlatLightLaf.setup();
        loginBtn.setText("LOGIN");
        loginBtn.setFocusPainted(false);
        setSize(700,500);
        setVisible(true);
        setLocationRelativeTo(null);
        pnl.add(loginBtn);
        pnl.add(login_title);
        getContentPane().add(pnl);
    }
}
