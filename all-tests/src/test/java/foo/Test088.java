package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test088 {
	@Test
	public void doTest088() throws Exception {
		Thread.sleep(200);
		int result = Util088.doStuff();
		assertEquals(88, result);
	}
}