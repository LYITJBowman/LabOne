/** 
 * 
 */
package labOne;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;


/**
 * @author james
 *
 */
public class initialiseWorld_Test {

	/**
	 * Test method for {@link labOne.initialiseWorld#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		
		initialiseWorld.main(null);
		
		assertEquals("Welcome adventurer" + System.getProperty("line.separator"), outContent.toString());
		
		 
	}

}
