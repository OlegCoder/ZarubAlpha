import javax.swing.*;

public class Game {

    public static void main(String args[]) {

        JFrame window = new JFrame("Zarub");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setContentPane(new GamePanel());

        window.pack();
        window.setResizable(false);
        window.setVisible(true);
    }

}
