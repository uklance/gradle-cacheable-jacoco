package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test054 {
	@Test
	public void doTest054() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util054.doStuff();
		assertEquals(54, result);
	}
}