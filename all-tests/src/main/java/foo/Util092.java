package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util092 {
	private static final Logger logger = LoggerFactory.getLogger(Util092.class);

	public static int doStuff() {
		logger.info("doing stuff 092");
		return 92;
	}
}