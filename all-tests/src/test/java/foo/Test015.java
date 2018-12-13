package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test015 {
	@Test
	public void doTest015() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util015.doStuff();
		assertEquals(15, result);
	}
}