import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2016/9/28 0028.
 */
public class LogTest {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public  void logger() {

        // System.out.println("This is println message.");
        // 记录debug级别的信息

        logger.debug("This is debug message.");

        // 记录info级别的信息

        logger.info("This is info message.");

        // 记录error级别的信息

        logger.error("This is error message.");

    }
}
