package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test017 {
	@Test
	public void doTest017() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util017.doStuff();
		assertEquals(17, result);
	}
}