package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test002 {
	@Test
	public void doTest002() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util002.doStuff();
		assertEquals(2, result);
	}
}