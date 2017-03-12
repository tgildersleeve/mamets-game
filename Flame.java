package mametsGame;

import sedgewick.StdDraw;

public class Flame {

	public double x;
	public double y;
	public boolean shoot;


	/**
	 * a pink lil' flame that frog shoots
	 * has-a x value, y value, and boolean for if its shooting or not
	 * @param x
	 * @param y
	 */
	public Flame(double x, double y) {
		this.x = x;
		this.y = y;
		this.shoot = false;
	}


	/**
	 * see if flame is shooting or not
	 * @return
	 */
	public boolean isShoot() {
		return shoot;
	}


	/**
	 * set whether or not flame is shooting
	 * @param shoot
	 */
	public void setShoot(boolean shoot) {
		this.shoot = shoot;
	}


	/**
	 * set flame's x value
	 * @param x
	 */
	public void setX(double x) {
		this.x = x;
	}


	/**
	 * set flame's y value
	 * @param y
	 */
	public void setY(double y) {
		this.y = y;
	}

	
	/**
	 * get flame's x value
	 */
	public double getX() {
		return x;
	}

	
	/**
	 * get flame's y value
	 */
	public double getY() {
		return y;
	}


	/**
	 * moves the flame forward (to the right) and slightly down
	 */
	public void shooting() {
		setX(getX() + 2);
		setY(getY() - .12);
	}

	
	/**
	 * uses fireCount from the main's play method to simulate animation (movement to the right) 
	 * of the flame
	 * @param fireCount
	 */
	public void shootFire(int fireCount) {
		if (shoot == true) {
			if (fireCount > 19) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount > 18) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount  > 17) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount  > 16) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount  > 15) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount  > 14) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount  > 13){
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount > 12) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount  > 11) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount  > 10) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount  > 9) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount  > 8) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount  > 7){
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount > 6) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount  > 5) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount  > 4) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount  > 3) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount  > 2) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount  > 1) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount  > 0) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount  > -1) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount  > -2) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount  > -3) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount > -4) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount > -5) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount > -6) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else if (fireCount > -7) {
				setX(getX() + 2);
				setY(getY() - .12);			}
			else{
				setX(getX() + 2);
				setY(getY() - .12);
				shoot = false;
			}
		}
	}

	
	/**
	 * draws the flame
	 */
	public void draw() {
		if (shoot == true) {
			StdDraw.picture(x, y, "src/images/fire1.jpg");	
		}
	}


}
