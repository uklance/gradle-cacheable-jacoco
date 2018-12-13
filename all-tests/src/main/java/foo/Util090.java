package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util090 {
	private static final Logger logger = LoggerFactory.getLogger(Util090.class);

	public static int doStuff() {
		logger.info("doing stuff 090");
		return 90;
	}
}