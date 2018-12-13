package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util081 {
	private static final Logger logger = LoggerFactory.getLogger(Util081.class);

	public static int doStuff() {
		logger.info("doing stuff 081");
		return 81;
	}
}