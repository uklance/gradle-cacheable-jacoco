package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test095 {
	@Test
	public void doTest095() throws Exception {
		Thread.sleep(200);
		int result = Util095.doStuff();
		assertEquals(95, result);
	}
}