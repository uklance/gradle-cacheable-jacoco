package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test091 {
	@Test
	public void doTest091() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util091.doStuff();
		assertEquals(91, result);
	}
}