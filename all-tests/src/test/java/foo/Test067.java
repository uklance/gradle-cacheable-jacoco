package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test067 {
	@Test
	public void doTest067() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util067.doStuff();
		assertEquals(67, result);
	}
}