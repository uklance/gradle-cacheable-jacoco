package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test059 {
	@Test
	public void doTest059() throws Exception {
		Thread.sleep(200);
		int result = Util059.doStuff();
		assertEquals(59, result);
	}
}