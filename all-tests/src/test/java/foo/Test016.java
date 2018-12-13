package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test016 {
	@Test
	public void doTest016() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util016.doStuff();
		assertEquals(16, result);
	}
}