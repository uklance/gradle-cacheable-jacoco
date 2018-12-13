package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test033 {
	@Test
	public void doTest033() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util033.doStuff();
		assertEquals(33, result);
	}
}