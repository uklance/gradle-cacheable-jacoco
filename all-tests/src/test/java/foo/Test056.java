package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test056 {
	@Test
	public void doTest056() throws Exception {
		Thread.sleep(200);
		int result = Util056.doStuff();
		assertEquals(56, result);
	}
}