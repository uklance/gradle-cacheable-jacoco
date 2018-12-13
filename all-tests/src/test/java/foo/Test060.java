package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test060 {
	@Test
	public void doTest060() throws Exception {
		Thread.sleep(200);
		int result = Util060.doStuff();
		assertEquals(60, result);
	}
}