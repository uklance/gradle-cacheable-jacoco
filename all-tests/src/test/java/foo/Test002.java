package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test002 {
	@Test
	public void doTest002() throws Exception {
		Thread.sleep(200);
		int result = Util002.doStuff();
		assertEquals(2, result);
	}
}