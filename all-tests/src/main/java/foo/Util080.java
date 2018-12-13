package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util080 {
	private static final Logger logger = LoggerFactory.getLogger(Util080.class);

	public static int doStuff() {
		logger.info("doing stuff 080");
		return 80;
	}
}