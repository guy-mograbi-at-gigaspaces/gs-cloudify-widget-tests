package widget.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: guym
 * Date: 8/21/13
 * Time: 11:03 PM
 */
@ContextConfiguration
public class TestDemo extends AbstractTestNGSpringContextTests {

    private static Logger logger = LoggerFactory.getLogger(TestDemo.class);

    @Test
    public void test(){
        logger.info("hello world");
    }
}
