/**
 * @author Maria Perez
 */
package rover;



/**
 * @author Maria Perez
 *
 * SPECIFICATION {wikilink}
 * 	
 * ASSUMPTIONS: 
 *      The rover will run sequentially, which means it will execute 
 *      the movement request and stop. 
 *      The rover response is assumed to be (0,0,N), instructions not formatted 
 * 		exactly as described are not supported.
 * 		If a rover is started in an invalid position then it will remain there.
 * 		If a rover is instructed to move from a valid position to an invalid position 
 * 		 then it will remain in the valid position and not execute any more instruction.
 * 	
 */
public class Rover {
	/*
	 * Class to describe a rover state
	 */
	 public Position position;
	    public Facing facing;
	    @SuppressWarnings("unused")
		private Grid grid;
	    private boolean obstacleHit;

	    public Rover(Position position, Facing facing, Grid grid)
	    {
	        this.position = position;
	        this.facing = facing;
	        this.grid = grid;
	        this.obstacleHit = false;
	    }

	    public void executeCommands(String commandString)
	    {
	        for (int i = 0; i < commandString.length(); i++)
	        {
	            char cmd = commandString.charAt(i);

	            switch(cmd )
	            {
	                case 'm':
	                    moveForward();
	                    break;
	                    // TODO: Do we need a backwards movement?
	                case 'l':
	                    facing.rotate(-90);
	                    break;
	                case 'r':
	                    facing.rotate(90);
	                    break;
	                default:
	                    break;
	            }
	            if(obstacleHit)
	            {
	                obstacleHit = false;
	                return;
	            }
	        }
	    }

	    @SuppressWarnings("unused")
		private void moveBackwards()
	    {
	        position.move(facing.back());

	      /* Use Case Missing: what happens if it hits an obstacle or 
	       * something unexpected makes the rover stop
	       */
	    }

	    private void moveForward()
	    {
	        position.move(facing.forward());

	        /* Use Case Missing: what happens if it hits an obstacle or 
		       * something unexpected makes the rover stop
		       */
	    }

		public char[] getPosition() {
			// TODO Auto-generated method stub
			return null;
		}
}
