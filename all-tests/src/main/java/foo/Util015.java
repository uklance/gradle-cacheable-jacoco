package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util015 {
	private static final Logger logger = LoggerFactory.getLogger(Util015.class);

	public static int doStuff() {
		logger.info("doing stuff 015");
		return 15;
	}
}