package mametsGame;

import java.awt.Color;
import java.awt.Font;

import sedgewick.StdDraw;

public class MametsGame {

	public Ball ball;
	public Frog datBoi;
	public Landscape scape;
	public Flame flame;
	public int score;
	public boolean hit;
	public int lives;

	
	/**
	 * Game constructor
	 * a game has-a ball, frog, landscape, score, # of lives,
	 * hit is used for if ball hits frog
	 */
	public MametsGame() {
		this.ball = new Ball(110, 18);
		this.datBoi = new Frog(10, 20.25);
		this.scape = new Landscape();
		this.flame = new Flame(18,25);
		this.score = 0;
		this.lives = 3;
		this.hit = false;
	}
	
	
	/**
	 * reset the game, but not score or lives
	 */
	public void reset() {
		this.ball = new Ball(110, 18);
		this.datBoi = new Frog(10, 20.25);
		this.scape = new Landscape();
		this.flame = new Flame(18,25);
		this.hit = false;
	}
	
	
	/**
	 * draws the pepe frog lives
	 */
	public void drawLives() {
		StdDraw.setPenColor(Color.black);
		StdDraw.setFont(new Font ("Arial", Font.BOLD, 13));
		StdDraw.text(3, 90, "lives:");
		if (lives == 3) {
			StdDraw.picture(15, 90, "src/images/PepeLife.jpg");
			StdDraw.picture(26, 90, "src/images/PepeLife.jpg");
			StdDraw.picture(37, 90, "src/images/PepeLife.jpg");
		}
		if (lives == 2) {
			StdDraw.picture(15, 90, "src/images/PepeLife.jpg");
			StdDraw.picture(26, 90, "src/images/PepeLife.jpg");
		}
		if (lives == 1) {
			StdDraw.picture(15, 90, "src/images/PepeLife.jpg");
		}
	}
	

	/**
	 * explosion method for ball hitting frog
	 * @param eX
	 * @param eY
	 */
	public void explode(double eX, double eY) {
		StdDraw.clear();
		scape.draw();
		drawScore();
		drawLives();
		int s = 25;
		StdDraw.picture(eX, eY, "src/images/F1.jpg");
		StdDraw.show(s);
		StdDraw.picture(eX, eY, "src/images/F2.jpg");
		StdDraw.show(s);
		StdDraw.picture(eX, eY, "src/images/F3.jpg");
		StdDraw.show(s);
		StdDraw.picture(eX, eY, "src/images/F4.jpg");
		StdDraw.show(s);
		StdDraw.picture(eX, eY, "src/images/F5.jpg");
		StdDraw.show(s);
		StdDraw.picture(eX, eY, "src/images/F6.jpg");
		StdDraw.show(s);
		StdDraw.picture(eX, eY, "src/images/F7.jpg");
		StdDraw.show(s);
		StdDraw.picture(eX, eY, "src/images/F8.jpg");
		StdDraw.show(s);
		StdDraw.picture(eX, eY, "src/images/F9.jpg");
		StdDraw.show(s);
		StdDraw.picture(eX, eY, "src/images/F10.jpg");
		StdDraw.show(s);
		StdDraw.picture(eX, eY, "src/images/F11.jpg");
		StdDraw.show(s);
		StdDraw.picture(eX, eY, "src/images/F12.jpg");
		StdDraw.show(s);
		StdDraw.clear();
		scape.draw();
		drawScore();
		drawLives();
		StdDraw.show(s);
	}
	
	
	/**
	 * explosion method for flame hitting ball
	 * @param eX
	 * @param eY
	 */
	public void explode2(double eX, double eY) {
		StdDraw.clear();
		scape.draw();
		drawScore();
		drawLives();
		datBoi.draw2(1, 0);
		int s = 25;
		StdDraw.picture(eX, eY, "src/images/F1.jpg");
		StdDraw.show(s);
		StdDraw.picture(eX, eY, "src/images/F2.jpg");
		StdDraw.show(s);
		StdDraw.picture(eX, eY, "src/images/F3.jpg");
		datBoi.draw2(6, 0);
		StdDraw.show(s);
		StdDraw.picture(eX, eY, "src/images/F4.jpg");
		StdDraw.show(s);
		StdDraw.picture(eX, eY, "src/images/F5.jpg");
		StdDraw.show(s);
		StdDraw.picture(eX, eY, "src/images/F6.jpg");
		datBoi.draw2(10, 0);
		StdDraw.show(s);
		StdDraw.picture(eX, eY, "src/images/F7.jpg");
		StdDraw.show(s);
		StdDraw.picture(eX, eY, "src/images/F8.jpg");
		StdDraw.show(s);
		StdDraw.picture(eX, eY, "src/images/F9.jpg");
		StdDraw.show(s);
		StdDraw.picture(eX, eY, "src/images/F10.jpg");
		datBoi.draw2(14, 0);
		StdDraw.show(s);
		StdDraw.picture(eX, eY, "src/images/F11.jpg");
		StdDraw.show(s);
		StdDraw.picture(eX, eY, "src/images/F12.jpg");
		StdDraw.show(s);
		StdDraw.clear();
		scape.draw();
		drawScore();
		drawLives();
		datBoi.draw2(18, 0);
		StdDraw.show(s);
	}
	
	
	/**
	 * atomic explosion animation used when all lives are lost
	 */
	public void atomic() {
		StdDraw.clear();
		scape.draw();
		drawScore();
		drawLives();
		int s = 100;
		StdDraw.picture(50, 40, "src/images/E1.jpg");
		StdDraw.show(s);StdDraw.picture(50, 40, "src/images/E1.jpg");
		StdDraw.show(s);StdDraw.picture(50, 40, "src/images/E2.jpg");
		StdDraw.show(s);StdDraw.picture(50, 40, "src/images/E3.jpg");
		StdDraw.show(s);StdDraw.picture(50, 40, "src/images/E4.jpg");
		StdDraw.show(s);StdDraw.picture(50, 40, "src/images/E5.jpg");
		StdDraw.show(s);StdDraw.picture(50, 40, "src/images/E6.jpg");
		StdDraw.show(s);StdDraw.picture(50, 40, "src/images/E7.jpg");
		StdDraw.show(s);StdDraw.picture(50, 40, "src/images/E8.jpg");
		StdDraw.show(s);StdDraw.picture(50, 40, "src/images/E9.jpg");
		StdDraw.show(s);StdDraw.picture(50, 40, "src/images/E10.jpg");
		StdDraw.show(s);StdDraw.picture(50, 40, "src/images/E11.jpg");
		StdDraw.show(s);StdDraw.picture(50, 40, "src/images/E12.jpg");
		StdDraw.show(s);StdDraw.picture(50, 40, "src/images/E13.jpg");
		StdDraw.show(s);StdDraw.picture(50, 40, "src/images/E14.jpg");
		StdDraw.show(s);StdDraw.picture(50, 40, "src/images/E15.jpg");
		StdDraw.show(s);StdDraw.picture(50, 40, "src/images/E16.jpg");
		StdDraw.show(s);StdDraw.picture(50, 40, "src/images/E17.jpg");
		StdDraw.show(s);StdDraw.picture(50, 40, "src/images/E18.jpg");
		StdDraw.show(s);StdDraw.picture(50, 40, "src/images/E19.jpg");
		StdDraw.show(s);
		StdDraw.clear();
		reset();
		scape.draw();
		drawScore();
		drawLives();
		StdDraw.show(s);
	}
	
	
	/**
	 * draws score
	 */
	public void drawScore() {
		StdDraw.setPenColor(Color.black);
		StdDraw.setFont(new Font ("Arial", Font.BOLD, 13));
		StdDraw.text(90, 90, "score: " + score);
	}
	
	
	/**
	 * text for starting screen
	 */
	public void start() {
		StdDraw.setPenColor(Color.black);
		StdDraw.setFont(new Font ("Arial", Font.BOLD, 70));
		StdDraw.text(50, 80, "MAMETS BALL");
		StdDraw.setFont(new Font ("Arial", Font.BOLD, 13));
		StdDraw.text(50, 65, "press J to jump");
		StdDraw.setFont(new Font ("Arial", Font.BOLD, 13));
		StdDraw.text(50, 60, "press S to shoot");
		StdDraw.pause(2000);
		StdDraw.setFont(new Font ("Arial", Font.BOLD, 50));
		StdDraw.text(40, 50, "starting in: 3 ");
		StdDraw.pause(1000);
		StdDraw.setFont(new Font ("Arial", Font.BOLD, 50));
		StdDraw.text(78, 50, "2");
		StdDraw.pause(1000);
		StdDraw.setFont(new Font ("Arial", Font.BOLD, 50));
		StdDraw.text(88, 50, "1");
		StdDraw.pause(1000);

	}


	/**
	 * runs the game
	 */
	public void play() {

		StdDraw.setXscale(0,100);
		StdDraw.setYscale(0,100);
		int count = 0;
		int jumpCount = 0;
		int fireCount = 21;
		
		// run starting screen text
		start();

		while (hit == false && lives > 0) {

			StdDraw.clear();
			
			// draw and move all things and increase/decrease counts
			scape.draw();
			ball.draw();
			flame.draw();
			drawLives();
			drawScore();
			jumpCount++;
			fireCount--;
			flame.shootFire(fireCount);
			datBoi.draw2(count, jumpCount);
			ball.moveLeft();

			StdDraw.show(15);

			// sense if jump key pressed (J)
			if (StdDraw.isKeyPressed(74)) {
				datBoi.jumping = true;
				jumpCount = 0;
			}

			// shoot pink flame
			if (StdDraw.isKeyPressed(83)){ // S
				flame.setShoot(true);
				fireCount = 20;
				flame.shootFire(fireCount);
			}

			// if ball goes oob, start new ball
			if (ball.getX() < -10) {
				ball = new Ball(110, 18);
			}

			// count is for draw2() in Frog
			count++;
			if (count == 20) {
				count = 0;
			}

			// if ball and frog hit, explosion and reset and life lost
			double dx = Math.abs(datBoi.x - ball.x);
			double dy = Math.abs(datBoi.y - ball.y);
			if (dx < 14 && dy < 14) {
				hit = true;
				double eX = (datBoi.x + ball.x)/2;
				double eY = (datBoi.y + ball.y)/2 + 2;
				explode(eX,eY);
				lives--;
				reset();
			}
			
			// if frog jumps over ball, score increases
			if (ball.x == 0) {
				score = score + 200;
			}
			
			// if flame hits ball, explosion and score increase and new flame and ball
			double fx = Math.abs(flame.x - ball.x);
			double fy = Math.abs(flame.y - ball.y);
			if (fx < 8 && fy < 8 && flame.x > 18) {
				double rx = (flame.x + ball.x)/2;
				double ry = (flame.y + ball.y)/2 + 2;
				explode2(rx,ry);	
				score = score + 100;
				flame.setShoot(false);
				flame = new Flame(18,25);
				ball = new Ball(110,18);
			}
			
			// "game over" scenario when all lives lost
			if (lives == 0) {
				atomic();
				
				StdDraw.setPenColor(Color.black);
				StdDraw.setFont(new Font ("Arial", Font.BOLD, 20));
				StdDraw.text(50, 50, "press mousepad to restart");
				StdDraw.show();
				while (!StdDraw.mousePressed()) {
				}
				reset();
				lives = 3;
			}
		}
	}


	/**
	 * let's gooooo
	 * @param args
	 */
	public static void main(String[] args) {
		MametsGame game = new MametsGame();
		game.play();
	}


}
