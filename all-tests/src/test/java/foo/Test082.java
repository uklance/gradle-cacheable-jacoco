package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test082 {
	@Test
	public void doTest082() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util082.doStuff();
		assertEquals(82, result);
	}
}