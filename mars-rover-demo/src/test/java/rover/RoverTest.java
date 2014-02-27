/**
 * @author Maria Perez
 */
package rover;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Maria Perez
 *
 */
public class RoverTest {

	/**
	 * Test method for {@link rover.Rover#Rover(java.lang.String)}.
	 */
	    Grid grid;

	    @Before
	    public void setup()
	    {
	        grid = new Grid(10, 10);
	    }

	    private Rover createRightFacingRoverAt(Integer x, Integer y)
	    {
	        Position position = new Position(x, y);
	        Facing facing = new Facing(1,0);
	        return new Rover(position, facing, grid);
	    }

	    @Test
	    public void processSingleForwardCommand()
	    {
	        Rover rover = createRightFacingRoverAt(0, 0);
	        rover.executeCommands("f");
	        assertTrue(1==rover.position.x);

	    }

	   // TODO: Test when going back only

	    @Test
	    public void processForwardAndBackwardCommands()
	    {
	        Rover rover = createRightFacingRoverAt(0, 0);
	        rover.executeCommands("fb");
	        assertTrue(0==rover.position.x);

	    }

	    @Test
	    public void processLeftCommands()
	    {
	        Rover rover = createRightFacingRoverAt(0, 0);
	        rover.executeCommands("l");
	        assertTrue(0 == rover.facing.x);
	        assertTrue(-1 == rover.facing.y);

	    }

	    @Test
	    public void processRightCommands()
	    {
	        Rover rover = createRightFacingRoverAt(0, 0);
	        rover.executeCommands("r");
	        assertTrue(0 == rover.facing.x);
	        assertTrue(1 == rover.facing.y);

	    }

	    // Use Case: Should we cater for multiple concurrent commands?


}
