package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util003 {
	private static final Logger logger = LoggerFactory.getLogger(Util003.class);

	public static int doStuff() {
		logger.info("doing stuff 003");
		return 3;
	}
}