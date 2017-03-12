package mametsGame;

import java.awt.Color;

import sedgewick.StdDraw;

public class Landscape {

	public double groundHeight;

	
	/**
	 * didn't really need to have a has-a, but whatevs
	 */
	public Landscape() {
		this.groundHeight = 10;
	}
	

	/**
	 * method I stole from the flowers extension to make the sky blend from blue to white
	 * using transparency
	 * @param c
	 * @param alpha
	 * @return
	 */
	public static Color transparentColor(Color c, int alpha) {
		return new Color(c.getRed(),c.getGreen(),c.getBlue(), alpha);   
	}

	
	/**
	 * draws the sky and grass
	 */
	public void draw() {
		StdDraw.setPenColor(Color.green);
		StdDraw.filledRectangle(50, groundHeight/2-2.5, 55, groundHeight/2 + 2.5);

		double dy = 0;
		Color c = new Color(210,255,255);
		for (int i=255; i >= 0; --i) {
			StdDraw.setPenColor(transparentColor(c, i));
			StdDraw.filledRectangle(50, 105 - dy, 55, .15);
			dy = dy + .125;
		}

	}


}
