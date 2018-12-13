package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test001 {
	@Test
	public void doTest001() throws Exception {
		Thread.sleep(200);
		int result = Util001.doStuff();
		assertEquals(1, result);
	}
}