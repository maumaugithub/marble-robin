/**
 * @author Maria Perez
 */
package rover;

import java.awt.Point;

/**
 * @author Maria Perez
 *
 */
public class Position {
	 	public Integer x;
	    public Integer y;

	    public Position(Integer x, Integer y)
	    {
	        this.x = x;
	        this.y = y;
	    }

	    public void move(Point direction)
	    {
	        x += direction.x;
	        y += direction.y;
	    }

	    public Point asPoint()
	    {
	        return new Point(x,y);
	    }

		public void move(Object forward) {
			// TODO Auto-generated method stub
			
		}
}
