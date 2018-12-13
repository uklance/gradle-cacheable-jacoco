package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util021 {
	private static final Logger logger = LoggerFactory.getLogger(Util021.class);

	public static int doStuff() {
		logger.info("doing stuff 021");
		return 21;
	}
}