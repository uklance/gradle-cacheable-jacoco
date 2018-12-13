package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test000 {
	@Test
	public void doTest000() throws Exception {
		Thread.sleep(200);
		int result = Util000.doStuff();
		assertEquals(0, result);
	}
}