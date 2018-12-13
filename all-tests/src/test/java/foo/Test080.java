package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test080 {
	@Test
	public void doTest080() throws Exception {
		Thread.sleep(200);
		int result = Util080.doStuff();
		assertEquals(80, result);
	}
}