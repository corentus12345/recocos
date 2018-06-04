package contract;
/**
 * 
 * @author corentin BOURGEY
 *
 */
public abstract interface IKeyPressed {
	/**
	 * Lorann can move on the right
	 * @param control
	 */
	public void right(IController control);
	/**
	 * Lorann can move on the left
	 * @param control
	 */
	public void left(IController control);
	/**
	 * Lorann can move on the top
	 * @param control
	 */
	public void up(IController control);
	/**
	 * Lorann can move on the buttom
	 * @param control
	 */
	public void down(IController control);
}
