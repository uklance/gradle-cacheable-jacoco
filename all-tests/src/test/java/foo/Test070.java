package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test070 {
	@Test
	public void doTest070() throws Exception {
		Thread.sleep(200);
		int result = Util070.doStuff();
		assertEquals(70, result);
	}
}