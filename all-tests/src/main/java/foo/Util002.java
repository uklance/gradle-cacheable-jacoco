package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util002 {
	private static final Logger logger = LoggerFactory.getLogger(Util002.class);

	public static int doStuff() {
		logger.info("doing stuff 002");
		return 2;
	}
}