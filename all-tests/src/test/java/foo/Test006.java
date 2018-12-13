package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test006 {
	@Test
	public void doTest006() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util006.doStuff();
		assertEquals(6, result);
	}
}