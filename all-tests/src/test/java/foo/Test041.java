package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test041 {
	@Test
	public void doTest041() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util041.doStuff();
		assertEquals(41, result);
	}
}