package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util060 {
	private static final Logger logger = LoggerFactory.getLogger(Util060.class);

	public static int doStuff() {
		logger.info("doing stuff 060");
		return 60;
	}
}