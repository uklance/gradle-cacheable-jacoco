package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test086 {
	@Test
	public void doTest086() throws Exception {
		Thread.sleep(200);
		int result = Util086.doStuff();
		assertEquals(86, result);
	}
}