package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test008 {
	@Test
	public void doTest008() throws Exception {
		Thread.sleep(200);
		int result = Util008.doStuff();
		assertEquals(8, result);
	}
}