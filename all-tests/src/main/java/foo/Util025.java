package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util025 {
	private static final Logger logger = LoggerFactory.getLogger(Util025.class);

	public static int doStuff() {
		logger.info("doing stuff 025");
		return 25;
	}
}