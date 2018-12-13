package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util064 {
	private static final Logger logger = LoggerFactory.getLogger(Util064.class);

	public static int doStuff() {
		logger.info("doing stuff 064");
		return 64;
	}
}