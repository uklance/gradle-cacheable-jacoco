package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test014 {
	@Test
	public void doTest014() throws Exception {
		Thread.sleep(200);
		int result = Util014.doStuff();
		assertEquals(14, result);
	}
}