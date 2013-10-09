package widget.beans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import webui.tests.annotations.SwitchTo;
import webui.tests.components.abstracts.AbstractComponent;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: guym
 * Date: 8/22/13
 * Time: 12:06 AM
 */
@Component
public class DemoPage extends AbstractComponent<DemoPage> {


    private static Logger logger = LoggerFactory.getLogger(DemoPage.class);



    @FindBy( css = ".walkthrough")
    public WebElement walkthrough;

    @SwitchTo
    @FindBy( css="iframe")
    public DemoWidgetWrapper demoWidgetWrapper;

//<div class="btn demo-link " ng-click="menuClick(widget)" data-api-key="c659bcad-776c-4132-8db5-a5ee03597397" ng-repeat="widget in widgets | orderBy:demoSort">
//    <div class="product-icon" style="background-image:url('/widget/icon?apiKey=c659bcad-776c-4132-8db5-a5ee03597397')"> </div>
//    <div class="product-name ng-binding"> MongoDB </div>
//    </div>

    @FindBy( css = ".demo-link" )
    List<WebElement> links;


    public DemoPage closeWalkthrough(){
        waitFor.elements(walkthrough);
        walkthrough.click();
        return this;
    }

    public DemoPage selectWidget( String name ){
        for (WebElement link : links) {
            if ( link.findElement(By.cssSelector(".product-name")).getText().contains(name)){
                link.click();
            }
        }
        demoWidgetWrapper.load( getRootElement() );
        return this;
    }

    public DemoPage startWidget(){
        load();
        demoWidgetWrapper.widget.start();
        return this;
    }

    public String getSourceCode(){
        return webDriver.getPageSource();
    }


}
