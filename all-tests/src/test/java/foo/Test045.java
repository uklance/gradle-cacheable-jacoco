package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test045 {
	@Test
	public void doTest045() throws Exception {
		Thread.sleep(200);
		int result = Util045.doStuff();
		assertEquals(45, result);
	}
}