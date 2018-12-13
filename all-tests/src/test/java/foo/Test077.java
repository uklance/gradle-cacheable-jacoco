package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test077 {
	@Test
	public void doTest077() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util077.doStuff();
		assertEquals(77, result);
	}
}