package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test048 {
	@Test
	public void doTest048() throws Exception {
		Thread.sleep(200);
		int result = Util048.doStuff();
		assertEquals(48, result);
	}
}