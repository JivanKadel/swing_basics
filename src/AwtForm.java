import java.awt.*;
import java.awt.event.*;

public class AwtForm extends Frame {
    public AwtForm(){
        Label firstNameLabel = new Label("First Name");
        firstNameLabel.setBounds(20, 60, 80, 30);
        Label lastNameLabel = new Label("Last Name");
        lastNameLabel.setBounds(20, 100, 80, 30);
        Label dobLabel = new Label("Date Of Birth");
        dobLabel.setBounds(20, 140, 80, 30);

        TextField firstNameText = new TextField();
        firstNameText.setBounds(120, 60, 80, 30);
        TextField lastNameText = new TextField();
        lastNameText.setBounds(120, 100, 80, 30);
        TextField dobText = new TextField();
        dobText.setBounds(120, 140, 80, 30);

        Button submitBtn = new Button("Submit");
        submitBtn.setBounds(20, 200, 80, 30);
        Button cancelBtn = new Button("Cancel");
        cancelBtn.setBounds(120, 200, 80, 30);

        firstNameText.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                if (!isValidName(firstNameText.getText())) {
                    firstNameText.setBackground(Color.RED);
                } else {
                    firstNameText.setBackground(Color.WHITE);
                }
            }
        });
        lastNameText.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                if (!isValidName(lastNameText.getText())) {
                    lastNameText.setBackground(Color.RED);
                } else {
                    lastNameText.setBackground(Color.WHITE);
                }
            }
        });

        dobText.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                String dob = dobText.getText();
                if(!isValidDate(dob)){
                    dobText.setBackground(Color.RED);
                }else{
                    dobText.setBackground(Color.WHITE);
                }
            }
        });

        add(firstNameLabel);
        add(firstNameText);
        add(lastNameLabel);
        add(lastNameText);
        add(dobLabel);
        add(dobText);
        add(submitBtn);
        add(cancelBtn);
        setSize(600, 750);
        setLayout(null);
        setVisible(true);

//        this.addWindowListener(new WindowListener() {
//            @Override
//            public void windowOpened(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowClosing(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowClosed(WindowEvent e) {
//                dispose();
//            }
//
//            @Override
//            public void windowIconified(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowDeiconified(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowActivated(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowDeactivated(WindowEvent e) {
//
//            }
//        });
    }
    private boolean isValidDate(String dob){
        return dob.matches("\\d{4}-\\d{2}-\\d{2}");
    }
    public boolean isValidName(String name){
        return name.matches("[a-zA-Z\\s]+");
    }

}
