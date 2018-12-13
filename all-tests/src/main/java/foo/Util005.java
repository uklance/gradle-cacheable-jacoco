package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util005 {
	private static final Logger logger = LoggerFactory.getLogger(Util005.class);

	public static int doStuff() {
		logger.info("doing stuff 005");
		return 5;
	}
}