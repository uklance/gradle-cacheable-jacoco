package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test089 {
	@Test
	public void doTest089() throws Exception {
		Thread.sleep(200);
		int result = Util089.doStuff();
		assertEquals(89, result);
	}
}