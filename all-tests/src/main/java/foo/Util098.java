package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util098 {
	private static final Logger logger = LoggerFactory.getLogger(Util098.class);

	public static int doStuff() {
		logger.info("doing stuff 098");
		return 98;
	}
}