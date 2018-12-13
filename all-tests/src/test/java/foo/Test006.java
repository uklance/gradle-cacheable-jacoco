package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test006 {
	@Test
	public void doTest006() throws Exception {
		Thread.sleep(200);
		int result = Util006.doStuff();
		assertEquals(6, result);
	}
}