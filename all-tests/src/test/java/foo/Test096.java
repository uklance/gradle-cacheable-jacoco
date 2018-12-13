package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test096 {
	@Test
	public void doTest096() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util096.doStuff();
		assertEquals(96, result);
	}
}