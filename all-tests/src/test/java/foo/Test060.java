package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test060 {
	@Test
	public void doTest060() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util060.doStuff();
		assertEquals(60, result);
	}
}