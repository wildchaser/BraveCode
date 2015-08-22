import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Lovemeornot {

	public static void main(String[] args) {
		JFrame frame = new JFrame("LOVE ME/LOVE ME NOT");
		JPanel panel = new JPanel(new GridLayout(0,2,20,20));
		JPanel gamePanel = new JPanel();
		JPanel controlPanel = new JPanel(new FlowLayout());
		
		JLabel banner = new JLabel("Hello");
		JLabel p1 = new JLabel(new ImageIcon(getImage("src/flower6.png")));
		
		JButton bt1 = new JButton("LoveMeOrNot");
		bt1.addActionListener(new ActionListener(){
			int click = 1;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				switch(click){
				case 0:
					p1.setIcon(new ImageIcon(getImage("src/flower6.png")));
					banner.setText("Love me");
					playSoundEffect();
					break;
				case 1:
					p1.setIcon(new ImageIcon(getImage("src/flower5.png")));
					banner.setText("Love me not");
					playSoundEffect();
					break;
				case 2:
					p1.setIcon(new ImageIcon(getImage("src/flower4.png")));
					banner.setText("Love me");
					playSoundEffect();
					break;
				case 3:
					p1.setIcon(new ImageIcon(getImage("src/flower3.png")));
					banner.setText("Love me not");
					playSoundEffect();
					break;
				case 4:
					p1.setIcon(new ImageIcon(getImage("src/flower2.png")));
					banner.setText("Love me");
					playSoundEffect();
					break;
				case 5:
					p1.setIcon(new ImageIcon(getImage("src/flower1.png")));
					banner.setText("Love me not");
					playSoundEffect();
					break;
				
				}
				click++;
			}
			
		});
		gamePanel.add(p1);
		controlPanel.add(banner);
		controlPanel.add(bt1);
	   
		panel.add(controlPanel);
		panel.add(gamePanel);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

	public static Image getImage(final String pathAndFileName) {
		   
	    return Toolkit.getDefaultToolkit().getImage(pathAndFileName);
	}

  
	public static void playSoundEffect(){
		URL f = null;
		try {
			f = new URL("file:/Users/WildChaser/Documents/workspace/TestMaya/src/picker.wav");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		AudioClip music = Applet.newAudioClip(f);
		music.play();
	}

	

}
