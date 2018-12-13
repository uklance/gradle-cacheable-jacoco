package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test086 {
	@Test
	public void doTest086() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util086.doStuff();
		assertEquals(86, result);
	}
}