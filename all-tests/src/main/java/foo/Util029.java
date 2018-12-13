package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util029 {
	private static final Logger logger = LoggerFactory.getLogger(Util029.class);

	public static int doStuff() {
		logger.info("doing stuff 029");
		return 29;
	}
}