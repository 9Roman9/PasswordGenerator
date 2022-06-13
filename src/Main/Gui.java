package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {
    Java java;
    JTextField password = new JTextField();
    int counter = 0;
    public Gui(){
        JPanel panel = new JPanel(new GridLayout(2,1));
        this.setName("PasswordGenerator");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(800,800);
        this.setLocation((screenSize.width - this.getWidth())/2,(screenSize.height - this.getHeight())/2);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panel);

        JButton button = new JButton("Згенерувати пароль:");
        panel.add(button);
        button.setFont(new Font("Freemono",Font.PLAIN,60));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java = new Java();
                password.setText(java.generatePassword());
            }
        });

        panel.add(password);
        password.setEditable(false);
        password.setFont(new Font("Freemono",Font.PLAIN,60));
        password.setHorizontalAlignment(JLabel.HORIZONTAL);
        panel.revalidate();
    }
}