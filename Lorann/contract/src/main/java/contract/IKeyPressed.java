package contract;

public abstract interface IKeyPressed {
	public void right(int level, IController control);
	
	public void left(int level, IController control);

	public void up(int level, IController control);

	public void down(int level, IController control);
}
