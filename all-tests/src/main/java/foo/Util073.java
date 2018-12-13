package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util073 {
	private static final Logger logger = LoggerFactory.getLogger(Util073.class);

	public static int doStuff() {
		logger.info("doing stuff 073");
		return 73;
	}
}