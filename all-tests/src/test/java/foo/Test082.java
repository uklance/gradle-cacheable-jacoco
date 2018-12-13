package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test082 {
	@Test
	public void doTest082() throws Exception {
		Thread.sleep(200);
		int result = Util082.doStuff();
		assertEquals(82, result);
	}
}