package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test065 {
	@Test
	public void doTest065() throws Exception {
		Thread.sleep(200);
		int result = Util065.doStuff();
		assertEquals(65, result);
	}
}