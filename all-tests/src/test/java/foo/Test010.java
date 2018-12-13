package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test010 {
	@Test
	public void doTest010() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util010.doStuff();
		assertEquals(10, result);
	}
}