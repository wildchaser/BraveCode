import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;

import javax.imageio.ImageIO;
import javax.print.DocFlavor.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class TimeTicker {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//create Jframe
		JFrame app = new JFrame("Bomber");
		
		//create JPanel
		final JPanel panel = new JPanel();

		//JLabel with first Picture
		final JLabel pic = new JLabel(new ImageIcon(getImage("src/BOMBER.jpg")));
		pic.setSize(100, 100);
		//Label for displaying time digit
		final JLabel label = new JLabel("");
		label.setLocation(200, 250);
	
		//create another thread
		Thread time = new Thread(){
			public void run(){
				for(int i=10; i>0; i--){
					if(i==1){
						pic.setIcon(new ImageIcon(getImage("src/images.png")));
					    
					    play();
					
					}
					label.setText("Time: "+i);
					try {
						sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		//add every component to where it belongs
		panel.add(pic);
		panel.add(label);
		app.add(panel);
		app.setSize(200, 300);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		time.start();
	}
	
	public static Image getImage(final String pathAndFileName) {
	   
	    return Toolkit.getDefaultToolkit().getImage(pathAndFileName);
	}

	public static void play()
	{
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(new File("src/NUKEXPLO.WAV")));
			clip.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
