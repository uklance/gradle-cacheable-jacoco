package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test039 {
	@Test
	public void doTest039() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util039.doStuff();
		assertEquals(39, result);
	}
}