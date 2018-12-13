package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test004 {
	@Test
	public void doTest004() throws Exception {
		Thread.sleep(200);
		int result = Util004.doStuff();
		assertEquals(4, result);
	}
}