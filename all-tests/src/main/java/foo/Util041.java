package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util041 {
	private static final Logger logger = LoggerFactory.getLogger(Util041.class);

	public static int doStuff() {
		logger.info("doing stuff 041");
		return 41;
	}
}