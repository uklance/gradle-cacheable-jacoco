package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util095 {
	private static final Logger logger = LoggerFactory.getLogger(Util095.class);

	public static int doStuff() {
		logger.info("doing stuff 095");
		return 95;
	}
}