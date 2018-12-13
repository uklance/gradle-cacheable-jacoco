package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util028 {
	private static final Logger logger = LoggerFactory.getLogger(Util028.class);

	public static int doStuff() {
		logger.info("doing stuff 028");
		return 28;
	}
}