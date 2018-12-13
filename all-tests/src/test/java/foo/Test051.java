package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test051 {
	@Test
	public void doTest051() throws Exception {
		Thread.sleep(200);
		int result = Util051.doStuff();
		assertEquals(51, result);
	}
}