package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util009 {
	private static final Logger logger = LoggerFactory.getLogger(Util009.class);

	public static int doStuff() {
		logger.info("doing stuff 009");
		return 9;
	}
}