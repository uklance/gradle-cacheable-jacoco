package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test007 {
	@Test
	public void doTest007() throws Exception {
		Thread.sleep(200);
		int result = Util007.doStuff();
		assertEquals(7, result);
	}
}