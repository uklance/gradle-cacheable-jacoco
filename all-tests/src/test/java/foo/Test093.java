package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test093 {
	@Test
	public void doTest093() throws Exception {
		Thread.sleep(200);
		int result = Util093.doStuff();
		assertEquals(93, result);
	}
}