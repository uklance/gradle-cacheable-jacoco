package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util004 {
	private static final Logger logger = LoggerFactory.getLogger(Util004.class);

	public static int doStuff() {
		logger.info("doing stuff 004");
		return 4;
	}
}