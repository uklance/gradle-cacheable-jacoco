package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util012 {
	private static final Logger logger = LoggerFactory.getLogger(Util012.class);

	public static int doStuff() {
		logger.info("doing stuff 012");
		return 12;
	}
}