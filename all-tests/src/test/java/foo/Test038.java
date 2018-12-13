package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test038 {
	@Test
	public void doTest038() throws Exception {
		Thread.sleep(200);
		int result = Util038.doStuff();
		assertEquals(38, result);
	}
}