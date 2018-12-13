package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util043 {
	private static final Logger logger = LoggerFactory.getLogger(Util043.class);

	public static int doStuff() {
		logger.info("doing stuff 043");
		return 43;
	}
}