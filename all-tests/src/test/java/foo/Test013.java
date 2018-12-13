package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test013 {
	@Test
	public void doTest013() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util013.doStuff();
		assertEquals(13, result);
	}
}