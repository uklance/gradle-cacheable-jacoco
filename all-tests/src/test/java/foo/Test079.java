package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test079 {
	@Test
	public void doTest079() throws Exception {
		Thread.sleep(200);
		int result = Util079.doStuff();
		assertEquals(79, result);
	}
}