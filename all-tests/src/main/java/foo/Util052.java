package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util052 {
	private static final Logger logger = LoggerFactory.getLogger(Util052.class);

	public static int doStuff() {
		logger.info("doing stuff 052");
		return 52;
	}
}