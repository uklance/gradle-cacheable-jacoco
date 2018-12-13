package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test084 {
	@Test
	public void doTest084() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util084.doStuff();
		assertEquals(84, result);
	}
}