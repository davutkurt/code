package test.pack;
import org.apache.log4j.Logger;

public class Log4j {
	public static final Logger log = Logger.getLogger(Log4j.class);
	public static void main(String[] args) {
		try {
			throw new Exception("new");
		} catch (Exception e) {
		log.error(e,e);	
		}
	}

}
