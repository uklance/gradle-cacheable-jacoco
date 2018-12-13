package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util026 {
	private static final Logger logger = LoggerFactory.getLogger(Util026.class);

	public static int doStuff() {
		logger.info("doing stuff 026");
		return 26;
	}
}