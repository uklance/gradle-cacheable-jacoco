package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test032 {
	@Test
	public void doTest032() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util032.doStuff();
		assertEquals(32, result);
	}
}