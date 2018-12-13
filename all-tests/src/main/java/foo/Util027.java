package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util027 {
	private static final Logger logger = LoggerFactory.getLogger(Util027.class);

	public static int doStuff() {
		logger.info("doing stuff 027");
		return 27;
	}
}