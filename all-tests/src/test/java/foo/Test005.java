package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test005 {
	@Test
	public void doTest005() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util005.doStuff();
		assertEquals(5, result);
	}
}