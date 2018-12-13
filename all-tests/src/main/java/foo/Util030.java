package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util030 {
	private static final Logger logger = LoggerFactory.getLogger(Util030.class);

	public static int doStuff() {
		logger.info("doing stuff 030");
		return 30;
	}
}