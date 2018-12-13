package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test031 {
	@Test
	public void doTest031() throws Exception {
		Thread.sleep(200);
		int result = Util031.doStuff();
		assertEquals(31, result);
	}
}