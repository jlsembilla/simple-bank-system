import java.awt.Color;

import javax.swing.*;
public class fullScreen extends JFrame{
    public fullScreen()
    {
        getContentPane().setBackground(Color.CYAN);
        setUndecorated(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);

    }
}
