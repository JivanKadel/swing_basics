import javax.swing.*;
import java.awt.*;

public class RegisterForm extends JFrame {
    RegisterForm() {
        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(100, 50, 300, 30);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(100, 150, 300, 30);
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(100, 250, 300, 30);
        JLabel confirmLabel = new JLabel("Confirm Password");
        confirmLabel.setBounds(100, 350, 300, 30);

        JTextField userName = new JTextField();
        userName.setBounds(100, 90, 300, 40);
        JTextField email = new JTextField();
        email.setBounds(100, 190, 300, 40);
        JTextField password = new JTextField();
        password.setBounds(100, 290, 300, 40);
        JTextField confirmPassword = new JTextField();
        confirmPassword.setBounds(100, 390, 300, 40);


        JButton registerBtn = new JButton("Register");
        registerBtn.setBounds(100, 500, 300, 50);

        add(userLabel);
        add(userName);
        add(emailLabel);
        add(email);
        add(passwordLabel);
        add(password);
        add(confirmLabel);
        add(confirmPassword);
        add(registerBtn);

        setFont(new Font("Arial", Font.PLAIN, 25));
        setSize(500, 650);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFontForAllComponents(this, new Font("Arial", Font.PLAIN, 30));
    }

    public static void setFontForAllComponents(Component component, Font font) {
        component.setFont(font);
        if (component instanceof Container) {
        for (Component child : ((Container) component).getComponents()) {
            setFontForAllComponents(child, font);
        }
        }
    }
}    