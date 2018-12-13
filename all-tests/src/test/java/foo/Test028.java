package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test028 {
	@Test
	public void doTest028() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util028.doStuff();
		assertEquals(28, result);
	}
}