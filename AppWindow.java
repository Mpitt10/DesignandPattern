import java.awt.BorderLayout;
import javax.swing.JFrame;

public class AppWindow extends JFrame {

    public void init() {
        setTitle(title:"My first Java Window");
        var cp = getContentPane();

        var canvas = new AppCanvas();
        cp.add(canvas, BorderLayout.CENTER);

        JButton button = new JButton(text:"Lucky Number");
        cp.add(button, BorderLayout.SOUTH);

        button.addActionListener(e -> {
            var r = new Random();
            int n = r.nextInt(bound:101);
            canvas.randomNumber = n;
            canvas.repaint();
        });
    }
}