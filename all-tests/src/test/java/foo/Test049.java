package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test049 {
	@Test
	public void doTest049() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util049.doStuff();
		assertEquals(49, result);
	}
}