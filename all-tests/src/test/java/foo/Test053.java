package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test053 {
	@Test
	public void doTest053() throws Exception {
		Thread.sleep(200);
		int result = Util053.doStuff();
		assertEquals(53, result);
	}
}