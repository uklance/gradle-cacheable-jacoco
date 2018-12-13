package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test026 {
	@Test
	public void doTest026() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util026.doStuff();
		assertEquals(26, result);
	}
}