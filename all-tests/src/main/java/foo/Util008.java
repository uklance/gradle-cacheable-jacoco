package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util008 {
	private static final Logger logger = LoggerFactory.getLogger(Util008.class);

	public static int doStuff() {
		logger.info("doing stuff 008");
		return 8;
	}
}