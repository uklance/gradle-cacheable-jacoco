package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util099 {
	private static final Logger logger = LoggerFactory.getLogger(Util099.class);

	public static int doStuff() {
		logger.info("doing stuff 099");
		return 99;
	}
}