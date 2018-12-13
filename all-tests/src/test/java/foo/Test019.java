package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test019 {
	@Test
	public void doTest019() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util019.doStuff();
		assertEquals(19, result);
	}
}