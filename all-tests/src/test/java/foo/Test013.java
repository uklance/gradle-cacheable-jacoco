package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test013 {
	@Test
	public void doTest013() throws Exception {
		Thread.sleep(200);
		int result = Util013.doStuff();
		assertEquals(13, result);
	}
}