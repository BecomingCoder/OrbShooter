import java.io.*;
import sun.audio.*;
import javax.swing.*;



public class Game {

    public static void main(String[] args) {

        JFrame window = new JFrame("Orb Shooter");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Closes application on window close

        window.setContentPane(new GamePanel());

        window.pack();  // Sets window size to whatever is inside of it
        window.setVisible(true);
    }
    
    public static void music() 
    {       
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;

        ContinuousAudioDataStream loop = null;

        try
        {
            InputStream test = new FileInputStream("rss/MyTrack1.wav");
            BGM = new AudioStream(test);
            AudioPlayer.player.start(BGM);
            MD = BGM.getData();
            loop = new ContinuousAudioDataStream(MD);

        }
        catch(Exception e){
        	e.printStackTrace();
        }
        
        MGP.start(loop);
    }


}
