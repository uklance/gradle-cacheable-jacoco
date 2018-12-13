package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test061 {
	@Test
	public void doTest061() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util061.doStuff();
		assertEquals(61, result);
	}
}