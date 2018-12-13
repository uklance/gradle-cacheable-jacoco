package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util040 {
	private static final Logger logger = LoggerFactory.getLogger(Util040.class);

	public static int doStuff() {
		logger.info("doing stuff 040");
		return 40;
	}
}