package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test085 {
	@Test
	public void doTest085() throws Exception {
		Thread.sleep(200);
		int result = Util085.doStuff();
		assertEquals(85, result);
	}
}