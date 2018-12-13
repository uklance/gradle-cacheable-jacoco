package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test092 {
	@Test
	public void doTest092() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util092.doStuff();
		assertEquals(92, result);
	}
}