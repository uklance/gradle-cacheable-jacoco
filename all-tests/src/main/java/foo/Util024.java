package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util024 {
	private static final Logger logger = LoggerFactory.getLogger(Util024.class);

	public static int doStuff() {
		logger.info("doing stuff 024");
		return 24;
	}
}