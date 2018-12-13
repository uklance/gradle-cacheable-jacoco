package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util035 {
	private static final Logger logger = LoggerFactory.getLogger(Util035.class);

	public static int doStuff() {
		logger.info("doing stuff 035");
		return 35;
	}
}