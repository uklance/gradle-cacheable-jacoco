package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test081 {
	@Test
	public void doTest081() throws Exception {
		Thread.sleep(200);
		int result = Util081.doStuff();
		assertEquals(81, result);
	}
}