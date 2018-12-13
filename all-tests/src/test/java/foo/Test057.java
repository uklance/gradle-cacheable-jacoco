package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test057 {
	@Test
	public void doTest057() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util057.doStuff();
		assertEquals(57, result);
	}
}