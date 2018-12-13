package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util032 {
	private static final Logger logger = LoggerFactory.getLogger(Util032.class);

	public static int doStuff() {
		logger.info("doing stuff 032");
		return 32;
	}
}