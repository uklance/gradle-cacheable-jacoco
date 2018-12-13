package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test062 {
	@Test
	public void doTest062() throws Exception {
		Thread.sleep(200);
		int result = Util062.doStuff();
		assertEquals(62, result);
	}
}