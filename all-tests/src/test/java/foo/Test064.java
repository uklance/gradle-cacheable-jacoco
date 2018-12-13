package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test064 {
	@Test
	public void doTest064() throws Exception {
		Thread.sleep(200);
		int result = Util064.doStuff();
		assertEquals(64, result);
	}
}