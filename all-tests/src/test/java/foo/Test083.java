package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test083 {
	@Test
	public void doTest083() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util083.doStuff();
		assertEquals(83, result);
	}
}