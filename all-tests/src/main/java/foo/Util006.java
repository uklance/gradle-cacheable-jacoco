package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util006 {
	private static final Logger logger = LoggerFactory.getLogger(Util006.class);

	public static int doStuff() {
		logger.info("doing stuff 006");
		return 6;
	}
}