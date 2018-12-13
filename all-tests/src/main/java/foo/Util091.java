package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util091 {
	private static final Logger logger = LoggerFactory.getLogger(Util091.class);

	public static int doStuff() {
		logger.info("doing stuff 091");
		return 91;
	}
}