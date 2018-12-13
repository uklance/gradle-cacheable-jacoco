package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test052 {
	@Test
	public void doTest052() throws Exception {
		Thread.sleep(200);
		int result = Util052.doStuff();
		assertEquals(52, result);
	}
}