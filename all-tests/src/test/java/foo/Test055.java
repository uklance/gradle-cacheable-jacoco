package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test055 {
	@Test
	public void doTest055() throws Exception {
		Thread.sleep(200);
		int result = Util055.doStuff();
		assertEquals(55, result);
	}
}