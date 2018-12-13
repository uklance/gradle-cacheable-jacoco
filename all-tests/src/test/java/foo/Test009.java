package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test009 {
	@Test
	public void doTest009() throws Exception {
		Thread.sleep(200);
		int result = Util009.doStuff();
		assertEquals(9, result);
	}
}