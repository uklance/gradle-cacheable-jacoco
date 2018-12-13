package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util042 {
	private static final Logger logger = LoggerFactory.getLogger(Util042.class);

	public static int doStuff() {
		logger.info("doing stuff 042");
		return 42;
	}
}