package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test024 {
	@Test
	public void doTest024() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util024.doStuff();
		assertEquals(24, result);
	}
}