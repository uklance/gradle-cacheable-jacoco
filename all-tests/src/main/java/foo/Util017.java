package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util017 {
	private static final Logger logger = LoggerFactory.getLogger(Util017.class);

	public static int doStuff() {
		logger.info("doing stuff 017");
		return 17;
	}
}