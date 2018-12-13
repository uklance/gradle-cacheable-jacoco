package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test078 {
	@Test
	public void doTest078() throws Exception {
		Thread.sleep(200);
		int result = Util078.doStuff();
		assertEquals(78, result);
	}
}