package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test018 {
	@Test
	public void doTest018() throws Exception {
		Thread.sleep(200);
		int result = Util018.doStuff();
		assertEquals(18, result);
	}
}