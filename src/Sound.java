

import java.applet.Applet;
import java.applet.AudioClip;

public class Sound {
	
	public static final Sound sound1 = new Sound("rss/track.wav");
	
	private AudioClip clip;
	
	public Sound(String track) {
		try {
			clip = Applet.newAudioClip(Sound.class.getResource(track));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void play() {
		try{
			new Thread(){
				public void run(){
					clip.loop();
				}
			}.start();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
