package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test012 {
	@Test
	public void doTest012() throws Exception {
		Thread.sleep(200);
		int result = Util012.doStuff();
		assertEquals(12, result);
	}
}