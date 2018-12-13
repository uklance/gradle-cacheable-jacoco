package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test098 {
	@Test
	public void doTest098() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util098.doStuff();
		assertEquals(98, result);
	}
}