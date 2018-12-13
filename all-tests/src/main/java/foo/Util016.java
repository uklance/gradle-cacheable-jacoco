package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util016 {
	private static final Logger logger = LoggerFactory.getLogger(Util016.class);

	public static int doStuff() {
		logger.info("doing stuff 016");
		return 16;
	}
}