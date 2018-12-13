package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test034 {
	@Test
	public void doTest034() throws Exception {
		Thread.sleep(200);
		int result = Util034.doStuff();
		assertEquals(34, result);
	}
}