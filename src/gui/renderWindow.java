public interface renderWindow extends JPanel{
	/**The following methods return the game specific co ordinates of the position specified. 
	 * The position returned will be relitive to thegame's internal mapping system, however
	 * it works.
	 */
	public int getRelativeX(int clickPos);
	public int getRelativeY(int clickPos);
	public int[] getRelativePos(int clickLeft, int clickY);
	
	}