package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test056 {
	@Test
	public void doTest056() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util056.doStuff();
		assertEquals(56, result);
	}
}