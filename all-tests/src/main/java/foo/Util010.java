package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util010 {
	private static final Logger logger = LoggerFactory.getLogger(Util010.class);

	public static int doStuff() {
		logger.info("doing stuff 010");
		return 10;
	}
}