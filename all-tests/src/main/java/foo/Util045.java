package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util045 {
	private static final Logger logger = LoggerFactory.getLogger(Util045.class);

	public static int doStuff() {
		logger.info("doing stuff 045");
		return 45;
	}
}