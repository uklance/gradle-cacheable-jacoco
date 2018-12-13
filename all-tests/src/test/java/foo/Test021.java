package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test021 {
	@Test
	public void doTest021() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util021.doStuff();
		assertEquals(21, result);
	}
}