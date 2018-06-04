package contract;
/**
 * 
 * @author corentin BRION, corentin BOURGEY
 *
 */
public abstract interface IController {
	/**
	 * Call the level of BDD
	 * @param level
	 */
	public void setLevel(int level);
	/**
	 * return the level select
	 * @return
	 */
	public int getLevel();
}
