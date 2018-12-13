package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test050 {
	@Test
	public void doTest050() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util050.doStuff();
		assertEquals(50, result);
	}
}