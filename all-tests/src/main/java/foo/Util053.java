package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util053 {
	private static final Logger logger = LoggerFactory.getLogger(Util053.class);

	public static int doStuff() {
		logger.info("doing stuff 053");
		return 53;
	}
}