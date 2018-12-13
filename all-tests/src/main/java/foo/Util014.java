package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util014 {
	private static final Logger logger = LoggerFactory.getLogger(Util014.class);

	public static int doStuff() {
		logger.info("doing stuff 014");
		return 14;
	}
}