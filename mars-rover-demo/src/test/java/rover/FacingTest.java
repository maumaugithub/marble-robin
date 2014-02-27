package rover;

import static org.junit.Assert.*;

import org.junit.Test;

public class FacingTest {

	@Test
    public void testTurningLeft()
    {
        Facing facing = new Facing(1,0);

        facing.rotate(-90);

        assertTrue(0 == facing.x);
        assertTrue(-1 == facing.y);
        
    }

    @Test
    public void testTurningRight()
    {
        Facing facing = new Facing(1,0);
        facing.rotate(90);

        assertTrue(0 == facing.x);
        assertTrue(1 == facing.y);
    }

}
