package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test017 {
	@Test
	public void doTest017() throws Exception {
		Thread.sleep(200);
		int result = Util017.doStuff();
		assertEquals(17, result);
	}
}