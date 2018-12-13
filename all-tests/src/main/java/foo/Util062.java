package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util062 {
	private static final Logger logger = LoggerFactory.getLogger(Util062.class);

	public static int doStuff() {
		logger.info("doing stuff 062");
		return 62;
	}
}