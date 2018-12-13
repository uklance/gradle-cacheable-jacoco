package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util018 {
	private static final Logger logger = LoggerFactory.getLogger(Util018.class);

	public static int doStuff() {
		logger.info("doing stuff 018");
		return 18;
	}
}