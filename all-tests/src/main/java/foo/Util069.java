package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util069 {
	private static final Logger logger = LoggerFactory.getLogger(Util069.class);

	public static int doStuff() {
		logger.info("doing stuff 069");
		return 69;
	}
}