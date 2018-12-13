package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test047 {
	@Test
	public void doTest047() throws Exception {
		Thread.sleep(200);
		int result = Util047.doStuff();
		assertEquals(47, result);
	}
}