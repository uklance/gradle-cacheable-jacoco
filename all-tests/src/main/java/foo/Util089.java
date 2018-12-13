package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util089 {
	private static final Logger logger = LoggerFactory.getLogger(Util089.class);

	public static int doStuff() {
		logger.info("doing stuff 089");
		return 89;
	}
}