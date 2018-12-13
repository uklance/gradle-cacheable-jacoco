package foo;

import org.junit.*;
import static org.junit.Assert.*;

public class Test044 {
	@Test
	public void doTest044() throws Exception {
		Thread.sleep((long) (Math.random() * 1000));
		int result = Util044.doStuff();
		assertEquals(44, result);
	}
}