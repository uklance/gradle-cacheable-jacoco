package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test046 {
	@Test
	public void doTest046() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util046.doStuff();
		assertEquals(46, result);
	}
}