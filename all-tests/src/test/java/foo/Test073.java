package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test073 {
	@Test
	public void doTest073() throws Exception {
		Thread.sleep(200);
		int result = Util073.doStuff();
		assertEquals(73, result);
	}
}