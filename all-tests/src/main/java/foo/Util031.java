package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util031 {
	private static final Logger logger = LoggerFactory.getLogger(Util031.class);

	public static int doStuff() {
		logger.info("doing stuff 031");
		return 31;
	}
}