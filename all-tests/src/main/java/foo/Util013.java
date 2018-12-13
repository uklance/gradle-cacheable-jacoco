package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util013 {
	private static final Logger logger = LoggerFactory.getLogger(Util013.class);

	public static int doStuff() {
		logger.info("doing stuff 013");
		return 13;
	}
}