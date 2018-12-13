package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test094 {
	@Test
	public void doTest094() throws Exception {
		Thread.sleep(200);
		int result = Util094.doStuff();
		assertEquals(94, result);
	}
}