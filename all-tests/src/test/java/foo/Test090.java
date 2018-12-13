package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test090 {
	@Test
	public void doTest090() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util090.doStuff();
		assertEquals(90, result);
	}
}