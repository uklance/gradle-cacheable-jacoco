package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test035 {
	@Test
	public void doTest035() throws Exception {
		Thread.sleep(200);
		int result = Util035.doStuff();
		assertEquals(35, result);
	}
}