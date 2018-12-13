package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test074 {
	@Test
	public void doTest074() throws Exception {
		Thread.sleep(200);
		int result = Util074.doStuff();
		assertEquals(74, result);
	}
}