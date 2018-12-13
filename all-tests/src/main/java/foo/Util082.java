package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util082 {
	private static final Logger logger = LoggerFactory.getLogger(Util082.class);

	public static int doStuff() {
		logger.info("doing stuff 082");
		return 82;
	}
}