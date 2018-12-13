package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test067 {
	@Test
	public void doTest067() throws Exception {
		Thread.sleep(200);
		int result = Util067.doStuff();
		assertEquals(67, result);
	}
}