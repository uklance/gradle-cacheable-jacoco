package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test063 {
	@Test
	public void doTest063() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util063.doStuff();
		assertEquals(63, result);
	}
}