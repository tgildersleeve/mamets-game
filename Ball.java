package mametsGame;

import sedgewick.StdDraw;

public class Ball {

	public double x;
	public double y;
	public String mamet;


	/**
	 * Balls are colored circles with a mamet face inside
	 * Ball has-a x and y coordinate and an image
	 * @param x
	 * @param y
	 */
	public Ball(double x, double y) {
		this.x = x;
		this.y = y;
		int a = (int) (Math.random() * 6);
		if (a==0) {
			mamet = "src/images/LeeBall.jpg";
		}
		if (a==1) {
			mamet = "src/images/AliciaBall.jpg";
		}
		if (a==2) {
			mamet = "src/images/KingBall.jpg";
		}
		if (a==3) {
			mamet = "src/images/EmmaBall.jpg";
		}
		if (a==4) {
			mamet = "src/images/TaraBall.jpg";
		}
		if (a==5) {
			mamet = "src/images/ShelbyBall.jpg";
		}
	}


	/**
	 * set x value of ball
	 * @param x
	 */
	public void setX(double x) {
		this.x = x;
	}


	/**
	 * move x value of ball left
	 */
	public void moveLeft() {
		this.x = x - 1;
	}


	/**
	 * draw the ball
	 */
	public void draw() {
		StdDraw.picture(x, y, mamet);
	}

	
	/**
	 * get the x value of the ball
	 * @return
	 */
	public double getX() {
		return x;
	}	

}
