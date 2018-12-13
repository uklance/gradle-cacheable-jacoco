package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test099 {
	@Test
	public void doTest099() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util099.doStuff();
		assertEquals(99, result);
	}
}