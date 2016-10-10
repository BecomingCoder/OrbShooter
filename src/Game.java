import javax.swing.*;



public class Game {

    public static void main(String[] args) {

        JFrame window = new JFrame("Orb Shooter");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Closes application on window close

        window.setContentPane(new GamePanel());

        window.pack();  // Sets window size to whatever is inside of it
        window.setVisible(true);
    }
}
