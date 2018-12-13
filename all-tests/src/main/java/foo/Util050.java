package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util050 {
	private static final Logger logger = LoggerFactory.getLogger(Util050.class);

	public static int doStuff() {
		logger.info("doing stuff 050");
		return 50;
	}
}