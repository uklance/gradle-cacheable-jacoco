package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test037 {
	@Test
	public void doTest037() throws Exception {
		Thread.sleep(200);
		int result = Util037.doStuff();
		assertEquals(37, result);
	}
}