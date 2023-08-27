import java.awt.BorderLayout;
import javax.swing.JFrame;

public class AppWindow extends JFrame {

    public void init() {
        setTitle(title:"My first Java Window");
        var cp = getContentPane();

        var canvas = new AppCanvas();
        cp.add(canvas, BorderLayout.CENTER);
    }
}