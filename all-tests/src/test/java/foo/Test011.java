package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test011 {
	@Test
	public void doTest011() throws Exception {
		Thread.sleep(200);
		int result = Util011.doStuff();
		assertEquals(11, result);
	}
}