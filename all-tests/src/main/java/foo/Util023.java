package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util023 {
	private static final Logger logger = LoggerFactory.getLogger(Util023.class);

	public static int doStuff() {
		logger.info("doing stuff 023");
		return 23;
	}
}