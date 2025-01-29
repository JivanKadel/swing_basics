import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AwtBasics {
    private String title = "";
    public AwtBasics(String title){
        this.title = title;
    }
    private int width = 500, height = 500;
    public void AwtFrame(){
        Frame f = new Frame(title);
        f.setSize(width, height);
        f.setLayout(null);
        f.setBackground(Color.DARK_GRAY);


        Button btn=new Button("Hello World");
        btn.setSize(200, 50);
        btn.setFont(new Font("Arial", Font.PLAIN, 20));
        btn.setForeground(Color.WHITE);
        btn.setBackground(Color.BLACK);
        btn.setBounds((width-btn.getWidth())/2, (height - btn.getWidth())/2, btn.getWidth(), btn.getHeight());

        f.add(btn);
        f.setVisible(true);
        f.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {
                width = f.getWidth();
                height = f.getHeight();
                btn.setBounds((width-btn.getWidth())/2, (height - btn.getHeight())/2, btn.getWidth(), btn.getHeight());
            }
            @Override
            public void componentMoved(ComponentEvent e) {}
            @Override
            public void componentShown(ComponentEvent e) {}
            @Override
            public void componentHidden(ComponentEvent e) {}
        });
        f.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {}
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
            @Override
            public void windowClosed(WindowEvent e) {}
            @Override
            public void windowIconified(WindowEvent e) {}
            @Override
            public void windowDeiconified(WindowEvent e) {}
            @Override
            public void windowActivated(WindowEvent e) {}
            @Override
            public void windowDeactivated(WindowEvent e) {}
        });
    }
}
