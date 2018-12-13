package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test045 {
	@Test
	public void doTest045() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util045.doStuff();
		assertEquals(45, result);
	}
}