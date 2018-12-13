package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test068 {
	@Test
	public void doTest068() throws Exception {
		Thread.sleep(200);
		int result = Util068.doStuff();
		assertEquals(68, result);
	}
}