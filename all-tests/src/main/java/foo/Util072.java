package foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util072 {
	private static final Logger logger = LoggerFactory.getLogger(Util072.class);

	public static int doStuff() {
		logger.info("doing stuff 072");
		return 72;
	}
}