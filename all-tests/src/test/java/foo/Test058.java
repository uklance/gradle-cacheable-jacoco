package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test058 {
	@Test
	public void doTest058() throws Exception {
		Thread.sleep(200);
		int result = Util058.doStuff();
		assertEquals(58, result);
	}
}