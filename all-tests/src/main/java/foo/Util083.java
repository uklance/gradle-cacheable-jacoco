package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util083 {
	private static final Logger logger = LoggerFactory.getLogger(Util083.class);

	public static int doStuff() {
		logger.info("doing stuff 083");
		return 83;
	}
}