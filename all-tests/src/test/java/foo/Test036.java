package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test036 {
	@Test
	public void doTest036() throws Exception {
		Thread.sleep(200);
		int result = Util036.doStuff();
		assertEquals(36, result);
	}
}