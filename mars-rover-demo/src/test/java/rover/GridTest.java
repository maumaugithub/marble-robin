/**
 * @author Maria Perez
 */
package rover;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Before;
import org.junit.Test;

public class GridTest {

	private Grid grid;

    @Before
    public void setup()
    {
        grid = new Grid(10, 10);
    }
  
    
    @Test
    public void testRightSideBoundary()
    {
        Position position = new Position(9, 0);

        position.move(new Point(1, 0));
        position = grid.enforceWrappingBounds(position);

        assertTrue(0 == position.x);
    }

    @Test
    public void testBottomBoundary()
    {
        Position position = new Position(0, 9);
        position.move(new Point(0, 1));
        position = grid.enforceWrappingBounds(position);

        assertTrue(0 == position.y);
    }

    @Test
    public void testLeftBoundary()
    {
        Position position = new Position(0, 0);

        position.move(new Point(-1, 0));
        position = grid.enforceWrappingBounds(position);

        assertTrue(grid.width-1 == position.x);
    }

    @Test
    public void testTopBoundary()
    {
        Position position = new Position(0, 0);

        position.move(new Point(0, -1));
        position = grid.enforceWrappingBounds(position);

        assertTrue(grid.height-1 == position.y);
    }

}
