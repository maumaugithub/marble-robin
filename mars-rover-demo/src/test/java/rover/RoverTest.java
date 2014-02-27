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
 *  Test Input:
	    5 5
	    1 2 N
	    LMLMLMLMM
	    3 3 E
	    MMRMMRMRRM

	    Expected Output:
	    1 3 N
	    5 1 E
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

	    private Rover createFrontFacingRoverAt(Integer x, Integer y)
	    {
	        Position position = new Position(x, y);
	        Facing facing = new Facing(1,0);
	        return new Rover(position, facing, grid);
	    }

	    @Test
	    public void processSingleForwardCommand()
	    {
	        Rover rover = createFrontFacingRoverAt(0, 0);
	        rover.executeCommands("f");
	        assertTrue(1==rover.position.x);

	    }

	   // TODO: Test when going back only

	    @Test
	    public void processLeftCommands()
	    {
	        Rover rover = createFrontFacingRoverAt(0, 0);
	        rover.executeCommands("l");
	        assertTrue(0 == rover.facing.x);
	        assertTrue(-1 == rover.facing.y);

	    }
	    
	    @Test
	    public void inputScenario1()
	    {
	        Rover rover = createFrontFacingRoverAt(5, 5);
	        // TODO: Need to implement a Direction on Grid
	        rover.executeCommands("m");
	        assertTrue(6 == rover.position.y);

	    }
	    
	    @Test
	    public void inputScenario2()
	    {
	        Rover rover = createFrontFacingRoverAt(1, 2);
	        // TODO: Need to implement a Direction on Grid
	        rover.executeCommands("m");
	        assertTrue(3==rover.position.y);

	    }
	    
	    @Test
	    public void inputScenario3()
	    {
	    	Rover rover = createFrontFacingRoverAt(0, 0);
	    	rover.executeCommands("lmlmlmlmm");
	    	System.out.println(rover.getPosition());
	    }

	    @Test
	    public void inputScenario4()
	    {
	        Rover rover = createFrontFacingRoverAt(3, 3);
	        // TODO: Need to implement a Direction on Grid
	        rover.executeCommands("r");
	        assertTrue(4 == rover.position.x);

	    }
	    @Test
	    public void inputScenario5()
	    {
	    	Rover rover = createFrontFacingRoverAt(0, 0);
	    	rover.executeCommands("mmrmmrmrrm");
	    	System.out.println(rover.getPosition());
	   }

	    @Test
	    public void processRightCommands()
	    {
	        Rover rover = createFrontFacingRoverAt(0, 0);
	        rover.executeCommands("r");
	        assertTrue(0 == rover.facing.x);
	        assertTrue(1 == rover.facing.y);

	    }

	    // Use Case: Should we cater for multiple concurrent commands?


}
