/**
 * @author Maria Perez
 */
package rover;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

public class PositionTest {

	@Test
    public void testMovingRight()
    {
        Position position = new Position(0, 0);
        position.move(new Point(1,0));
        assertTrue(1 == position.x);
    }

    @Test
    public void testMovingLeft()
    {
        Position position = new Position(1, 0);
        position.move(new Point(-1,0));
        assertTrue(0 == position.x);
    }

    @Test
    public void testMovingUp()
    {
        Position position = new Position(0, 1);
        position.move(new Point(0,-1));
        assertTrue (0 == position.y);
    }
    
    @Test
    public void testMovingNorth()
    {
    	// TODO: Implement similar to move up
        Position position = new Position(0, 1);
        position.move(new Point(0,-1));
        assertTrue (0 == position.y);
    }

    @Test
    public void testMovingDown()
    {
        Position position = new Position(0, 0);
        position.move(new Point(0,1));
        assertTrue(1 == position.y);
    }

    @Test
    public void testMovingSouth()
    {
    	// TODO: Implement similar to move down
        Position position = new Position(0, 0);
        position.move(new Point(0,1));
        assertTrue(1 == position.y);
    }
}
