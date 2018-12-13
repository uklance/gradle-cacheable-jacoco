package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test022 {
	@Test
	public void doTest022() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util022.doStuff();
		assertEquals(22, result);
	}
}