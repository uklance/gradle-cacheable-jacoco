package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util001 {
	private static final Logger logger = LoggerFactory.getLogger(Util001.class);

	public static int doStuff() {
		logger.info("doing stuff 001");
		return 1;
	}
}