package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test072 {
	@Test
	public void doTest072() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util072.doStuff();
		assertEquals(72, result);
	}
}