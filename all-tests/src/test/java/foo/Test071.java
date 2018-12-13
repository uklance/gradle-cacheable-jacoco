package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test071 {
	@Test
	public void doTest071() throws Exception {
		Thread.sleep(200);
		int result = Util071.doStuff();
		assertEquals(71, result);
	}
}