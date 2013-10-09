package widget.tests;

import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import widget.beans.DemoPage;
import widget.beans.DemoPageWrapper;

/**
 * Created with IntelliJ IDEA.
 * User: guym
 * Date: 8/21/13
 * Time: 11:03 PM
 */
@ContextConfiguration
public class TestDemo extends AbstractTestNGSpringContextTests {

    private static Logger logger = LoggerFactory.getLogger(TestDemo.class);

    @Autowired
    public DemoPageWrapper demoPageWrapper;



    @Test
    public void test(){
        DemoPage demoPage = demoPageWrapper.goTo().load().demoPage;
        demoPage.closeWalkthrough();
        demoPage.selectWidget("MongoDB");
        try{Thread.sleep(10000);}catch(Exception e){}
        demoPage.startWidget();
        try{Thread.sleep(10000);}catch(Exception e){}
        logger.info("hello world");
    }
}
