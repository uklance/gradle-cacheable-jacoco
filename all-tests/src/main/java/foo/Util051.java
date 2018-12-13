package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util051 {
	private static final Logger logger = LoggerFactory.getLogger(Util051.class);

	public static int doStuff() {
		logger.info("doing stuff 051");
		return 51;
	}
}