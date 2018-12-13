package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test087 {
	@Test
	public void doTest087() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util087.doStuff();
		assertEquals(87, result);
	}
}