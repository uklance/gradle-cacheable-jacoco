package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test076 {
	@Test
	public void doTest076() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util076.doStuff();
		assertEquals(76, result);
	}
}