package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test075 {
	@Test
	public void doTest075() throws Exception {
		Thread.sleep(200);
		int result = Util075.doStuff();
		assertEquals(75, result);
	}
}