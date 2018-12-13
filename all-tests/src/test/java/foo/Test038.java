package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test038 {
	@Test
	public void doTest038() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util038.doStuff();
		assertEquals(38, result);
	}
}