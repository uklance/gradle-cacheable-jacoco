package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test043 {
	@Test
	public void doTest043() throws Exception {
		Thread.sleep(200);
		int result = Util043.doStuff();
		assertEquals(43, result);
	}
}