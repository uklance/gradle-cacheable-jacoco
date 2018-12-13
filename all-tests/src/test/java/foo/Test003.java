package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test003 {
	@Test
	public void doTest003() throws Exception {
		Thread.sleep(200);
		int result = Util003.doStuff();
		assertEquals(3, result);
	}
}