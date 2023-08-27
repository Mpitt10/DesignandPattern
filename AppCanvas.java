import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class AppCanvas extends JPanel {

    int randomNumber = 0;

    public AppCanvas() {
        setPreferredSize(new Dimension(width:300, height:250));
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawString(str:"Lucky Number Is:", x:30, y:100);
        g.drawString("" + randomNumber, x:30, y:140);
    }
}