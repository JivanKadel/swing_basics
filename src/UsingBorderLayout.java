import javax.swing.*;
import java.awt.*;

public class UsingBorderLayout {
    public UsingBorderLayout(String title){
        JFrame jf = new JFrame(title);

        JLabel userLabel = new JLabel("Username");
        JTextField username = new JTextField();
        JLabel emailLabel = new JLabel("Email");
        JTextField email = new JTextField();
        JLabel passwordLabel = new JLabel("Password");
        JTextField password = new JTextField();

        jf.setLayout(new BorderLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jp = new JPanel();
        jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
        jp.add(userLabel);
        jp.add(username);
        jp.add(emailLabel);
        jp.add(email);
        jp.add(passwordLabel);
        jp.add(password);

        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        centerPanel.add(jp);

        jf.add(centerPanel, BorderLayout.CENTER);
        jf.pack();
        jf.setLocationRelativeTo(null);
//        jf.setSize(500, 500);
        setFontForAllComponents(jf, new Font("Arial", Font.BOLD, 24));
        jf.setVisible(true);
    }
    public static void setFontForAllComponents(Component component, Font font){
        component.setFont(font);
        if(component instanceof Container){
            for(Component child: ((Container) component).getComponents()){
                setFontForAllComponents(child, font);
            }
        }
    }
}
