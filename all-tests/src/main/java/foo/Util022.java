package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util022 {
	private static final Logger logger = LoggerFactory.getLogger(Util022.class);

	public static int doStuff() {
		logger.info("doing stuff 022");
		return 22;
	}
}