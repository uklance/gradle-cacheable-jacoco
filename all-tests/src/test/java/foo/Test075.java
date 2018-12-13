package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test075 {
	@Test
	public void doTest075() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util075.doStuff();
		assertEquals(75, result);
	}
}