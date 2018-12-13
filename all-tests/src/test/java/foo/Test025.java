package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test025 {
	@Test
	public void doTest025() throws Exception {
		Thread.sleep(200);
		int result = Util025.doStuff();
		assertEquals(25, result);
	}
}