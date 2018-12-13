package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util071 {
	private static final Logger logger = LoggerFactory.getLogger(Util071.class);

	public static int doStuff() {
		logger.info("doing stuff 071");
		return 71;
	}
}