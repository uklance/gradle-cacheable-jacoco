package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test040 {
	@Test
	public void doTest040() throws Exception {
		Thread.sleep(200);
		int result = Util040.doStuff();
		assertEquals(40, result);
	}
}