import javax.swing.*;

public class GroupLayoutUsage {


    public static void main(String[] args) {
        JFrame frame = new JFrame("GroupLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField(15);
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");
        JButton cancelButton = new JButton("Cancel");

        // Create GroupLayout and set to frame's content pane
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);

        // Set automatic gaps between components
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Horizontal grouping
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(userLabel)
                        .addComponent(passLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(userField)
                        .addComponent(passField)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(loginButton)
                                .addComponent(cancelButton)))
        );

        // Vertical grouping
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(userLabel)
                        .addComponent(userField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(passLabel)
                        .addComponent(passField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(loginButton)
                        .addComponent(cancelButton))
        );

        frame.pack();
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}


