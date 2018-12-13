package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util070 {
	private static final Logger logger = LoggerFactory.getLogger(Util070.class);

	public static int doStuff() {
		logger.info("doing stuff 070");
		return 70;
	}
}