package mametsGame;

import sedgewick.StdDraw;

public class Frog {

	public double x;
	public double y;
	public boolean jumping;

	
	/**
	 * Frog is Dat Boi and has-a x and y value
	 * also has a boolean for jumping, because i need to stop him from cycling when he jumps
	 * @param x
	 * @param y
	 */
	public Frog(double x, double y) {
		this.x = x;
		this.y = y;
		this.jumping = false;
	}

	
	/**
	 * see whether or not frog is jumping
	 * @return
	 */
	public boolean isJumping() {
		return jumping;
	}

	
	/**
	 * set whether or not frog is jumping
	 * @param jumping
	 */
	public void setJumping(boolean jumping) {
		this.jumping = jumping;
	}

	
	/**
	 * get x value of frog
	 * @return
	 */
	public double getX() {
		return this.x;
	}

	
	/**
	 * get y value of frog
	 * @return
	 */
	public double getY() {
		return this.y;
	}

	/**
	 * set x value of frog
	 * @param x
	 */
	public void setX(double x) {
		this.x = x;
	}

	
	/**
	 * set y value of frog
	 * @param y
	 */
	public void setY(double y) {
		this.y = y;
	}


	/**
	 * annoyingly complicated draw method because I had to figure out frog's cycling animation
	 * and did it in a way that it is probably not traditionally done.
	 * If frog is not jumping, it takes in a count from the main's play method which times out
	 * when the frog should switch images to look like it's cycling or jumping
	 * If frog is jumping, it takes in jumpCount from the main's play method to time out how quickly
	 * the frog photo should move up and then down to simulate jumping
	 * @param count
	 * @param jumpCount
	 */
	public void draw2(int count, int jumpCount) {
		if (jumping == false) {
			if (count < 4) {
				StdDraw.picture(x, y, "src/images/Frog1.jpg");
			}
			else if (count < 8) {
				StdDraw.picture(x, y, "src/images/Frog2.jpg");
			}
			else if (count < 12) {
				StdDraw.picture(x, y, "src/images/Frog3.jpg");
			}
			else if (count < 16) {
				StdDraw.picture(x, y, "src/images/Frog4.jpg");
			}
			else if (count < 20) {
				StdDraw.picture(x, y, "src/images/Frog5.jpg");
			}
		}
		else {
			StdDraw.picture(x, y, "src/images/Frog1.jpg");
			if (jumpCount == 1) {		
				setY(23.25);
			}
			else if (jumpCount == 2) {		
				setY(26.25);
			}
			else if (jumpCount < 2*2) {		
				setY(30.25);
			}
			else if (jumpCount < 3*2){
				setY(33.25);
			}
			else if (jumpCount < 4*2) {
				setY(39.25);
			}
			else if (jumpCount < 5*2) {
				setY(43.25);
			}
			else if (jumpCount < 6*2) {
				setY(47.25);
			}
			else if (jumpCount < 7*2) {
				setY(50.25);
			}
			else if (jumpCount < 8*2) {
				setY(53.25);
			}
			else if (jumpCount < 9*2) {
				setY(55.25);
			}
			else if (jumpCount < 10*2) {
				setY(57.25);
			}
			else if (jumpCount < 11*2) {
				setY(58.25);
			}
			else if (jumpCount < 12*2) {
				setY(59.25);
			}
			else if (jumpCount < 13*2) {
				setY(58.25); 
			}
			else if (jumpCount < 14*2) {
				setY(57.25);
			}
			else if (jumpCount < 15*2) {
				setY(55.25);
			}
			else if (jumpCount < 16*2) {
				setY(53.25);
			}
			else if (jumpCount < 17*2) {		
				setY(50.25);
			}
			else if (jumpCount < 18*2){
				setY(47.25);
			}
			else if (jumpCount < 19*2) {
				setY(44.25);
			}
			else if (jumpCount < 20*2) {
				setY(41.25);
			}
			else if (jumpCount < 21*2) {		
				setY(38.25);
			}
			else if (jumpCount < 22*2){
				setY(35.25);
			}
			else if (jumpCount < 23*2) {
				setY(32.25);
			}
			else if (jumpCount < 24*2) {		
				setY(29.25);
			}
			else if (jumpCount < 25*2){
				setY(26.25);
			}
			else if (jumpCount < 26*2){
				setY(23.25);
			}
			else {
				setY(20.25);
				setJumping(false);
			}
		}
	}


}
