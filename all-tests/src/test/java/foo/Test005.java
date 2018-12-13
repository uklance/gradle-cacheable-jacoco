package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test005 {
	@Test
	public void doTest005() throws Exception {
		Thread.sleep(200);
		int result = Util005.doStuff();
		assertEquals(5, result);
	}
}