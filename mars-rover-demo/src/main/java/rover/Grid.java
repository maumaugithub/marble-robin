/**
 * @author Maria Perez
 */
package rover;


/**
 * @author Maria Perez
 *
 */
public class Grid {
	 	public Integer width;
	    public Integer height;
	    public enum direction{N,S,E,W}

	    public Grid(Integer width, Integer height)
	    {
	        this.width = width;
	        this.height = height;

	    }

	    public Position enforceWrappingBounds(Position position)
	    {
	        wrapXAxis(position);
	        wrapYAxis(position);

	        return position;
	    }

	    private void wrapYAxis(Position position)
	    {
	        if (position.y < 0)
	            position.y = height - 1;
	        else
	            position.y %= height;
	    }

	    private void wrapXAxis(Position position)
	    {
	        if (position.x < 0)
	            position.x = width - 1;
	        else
	            position.x %= width;
	    }
}
