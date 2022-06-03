package FinalProject;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.print.DocFlavor.URL;
import javax.swing.JFrame;

/**
 * this class runs the program
 * 
 * @author Andrea (and Ally)
 * @version 05.27.2022
 */
public class ParentingLessons {

	/** this int variable stores the level that the player is on */
	public static int level;

	/** this JFrame variable is the frame that the player will play on */
	public static JFrame frame;

	/**
	 * initialize the JFrame
	 */
	private static void initializeFrame() {
		frame = new JFrame();
		frame.setSize(1200, 750);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

	/**
	 * this method gets the image from the file
	 * 
	 * @param path - the path of the image
	 * @return the buffered image of the image from file
	 */
	public static BufferedImage imageFromFile(String path) {
		try {
			java.net.URL resource = ParentingLessons.class.getResource(path);
			if (resource == null)
				throw new NullPointerException();
			return ImageIO.read(resource);
		} catch (IOException | NullPointerException e) {
			System.err.println("There was an error retrieving " + path);
		}
		return null;
	}

	/**
	 * main method that runs the game
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		initializeFrame();

		while (frame.isVisible()) {
			// Level1 lvl1 = new Level1();
			// frame.add(lvl1);
			// lvl1.start();
			// frame.remove(lvl1);

			Level2 lvl2 = new Level2();
			frame.add(lvl2);
			lvl2.start();
			frame.remove(lvl2);

			// Level3 lvl3 = new Level3();
			// frame.add(lvl3);
			// lvl3.start();
			// frame.remove(lvl3);
		}

	}

}