package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util011 {
	private static final Logger logger = LoggerFactory.getLogger(Util011.class);

	public static int doStuff() {
		logger.info("doing stuff 011");
		return 11;
	}
}