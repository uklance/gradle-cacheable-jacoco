package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util000 {
	private static final Logger logger = LoggerFactory.getLogger(Util000.class);

	public static int doStuff() {
		logger.info("doing stuff 000");
		return 0;
	}
}