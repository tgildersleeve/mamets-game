package mametsGame;

public interface Anim {
	
	/**
	 * Draw itself on the screen, however it likes
	 */
	public void draw();

	/**
	 * Tell me whether it is finished, and should be removed from my
	 *     list of things I'm animating.
	 * I don't actually use this though!
	 * @return whether this Anim is done
	 */
	public boolean isDone();
	
	public double getX();
	
	public double getY();

}
