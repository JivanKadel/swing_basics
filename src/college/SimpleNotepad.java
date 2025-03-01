package college;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.KeyEvent;

public class SimpleNotepad {
    JFrame jf;
    JMenuBar mb;
    JMenu file, exit, save;
    JMenuItem newFile, openFile, exitApp, saveFile;
    JTextArea inputArea;
    Border inputBorder;
    Font menuItemFont, menuFont, inputFont;

    public SimpleNotepad(){
        menuItemFont = new Font("Arial", Font.PLAIN, 16);
        menuFont = new Font("Arial", Font.PLAIN, 20);
        inputFont = new Font("Times New Roman", Font.PLAIN, 18);

        inputBorder = new EmptyBorder(4, 8, 4, 8);

        jf = new JFrame();
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        KeyStroke ctrlN = KeyStroke.getKeyStroke(KeyEvent.VK_N, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx());
        KeyStroke ctrlO = KeyStroke.getKeyStroke(KeyEvent.VK_O, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx());
        KeyStroke ctrlS = KeyStroke.getKeyStroke(KeyEvent.VK_S, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx());
        KeyStroke ctrlEsc = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx());

        newFile = new JMenuItem("New");
        newFile.setFont(menuItemFont);
        newFile.setAccelerator(ctrlN);
        openFile = new JMenuItem("Open");
        openFile.setFont(menuItemFont);
        openFile.setAccelerator(ctrlO);

        file = new JMenu("File");
        file.setFont(menuFont);
        file.add(newFile);
        file.add(openFile);

        saveFile = new JMenuItem("Save File");
        saveFile.setFont(menuItemFont);
        saveFile.setAccelerator(ctrlS);

        save = new JMenu("Save");
        save.setFont(menuFont);
        save.add(saveFile);

        exit = new JMenu("Exit");
        exit.setFont(menuFont);
        exitApp = new JMenuItem("Exit");
        exitApp.setFont(menuItemFont);
        exitApp.setAccelerator(ctrlEsc);

        exit.add(exitApp);

        mb = new JMenuBar();

        mb.add(file);
        mb.add(save);
        mb.add(exit);

        jf.setJMenuBar(mb);


        inputArea = new JTextArea();
        inputArea.setFont(inputFont);
        inputArea.setBorder(inputBorder);

        jf.add(inputArea);

        jf.setVisible(true);
    }
}
