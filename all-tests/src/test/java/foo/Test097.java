package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test097 {
	@Test
	public void doTest097() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util097.doStuff();
		assertEquals(97, result);
	}
}