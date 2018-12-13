package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test066 {
	@Test
	public void doTest066() throws Exception {
		Thread.sleep(200);
		int result = Util066.doStuff();
		assertEquals(66, result);
	}
}