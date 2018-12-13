package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test029 {
	@Test
	public void doTest029() throws Exception {
		Thread.sleep(200);
		int result = Util029.doStuff();
		assertEquals(29, result);
	}
}