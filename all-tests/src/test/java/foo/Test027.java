package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test027 {
	@Test
	public void doTest027() throws Exception {
		Thread.sleep(200);
		int result = Util027.doStuff();
		assertEquals(27, result);
	}
}