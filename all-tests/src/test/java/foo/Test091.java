package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test091 {
	@Test
	public void doTest091() throws Exception {
		Thread.sleep(200);
		int result = Util091.doStuff();
		assertEquals(91, result);
	}
}