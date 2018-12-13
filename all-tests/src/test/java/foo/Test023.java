package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test023 {
	@Test
	public void doTest023() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util023.doStuff();
		assertEquals(23, result);
	}
}