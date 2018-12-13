package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test030 {
	@Test
	public void doTest030() throws Exception {
		Thread.sleep(200);
		int result = Util030.doStuff();
		assertEquals(30, result);
	}
}