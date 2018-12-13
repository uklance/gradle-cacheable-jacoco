package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test069 {
	@Test
	public void doTest069() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util069.doStuff();
		assertEquals(69, result);
	}
}