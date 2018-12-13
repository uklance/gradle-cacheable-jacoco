package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util020 {
	private static final Logger logger = LoggerFactory.getLogger(Util020.class);

	public static int doStuff() {
		logger.info("doing stuff 020");
		return 20;
	}
}