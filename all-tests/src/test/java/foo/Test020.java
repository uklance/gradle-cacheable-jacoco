package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test020 {
	@Test
	public void doTest020() throws Exception {
		Thread.sleep(200);
		int result = Util020.doStuff();
		assertEquals(20, result);
	}
}