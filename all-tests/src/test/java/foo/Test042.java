package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test042 {
	@Test
	public void doTest042() throws Exception {
		Thread.sleep(200);
		int result = Util042.doStuff();
		assertEquals(42, result);
	}
}