package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test096 {
	@Test
	public void doTest096() throws Exception {
		Thread.sleep(200);
		int result = Util096.doStuff();
		assertEquals(96, result);
	}
}