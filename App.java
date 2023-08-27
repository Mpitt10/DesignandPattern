import javax.swing.JFrame;

public class App {

    public static void main(String[] args) {
        AppWindow win = new AppWindow();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.init();

        win.setVisible(b:true);
        win.pack();
    }
}