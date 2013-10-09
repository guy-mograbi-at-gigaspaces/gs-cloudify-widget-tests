package widget.beans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import webui.tests.annotations.SwitchTo;
import webui.tests.components.abstracts.AbstractComponent;

/**
 * Created with IntelliJ IDEA.
 * User: guym
 * Date: 10/8/13
 * Time: 11:34 PM
 */
public class DemoWidgetWrapper extends AbstractComponent<DemoWidgetWrapper>{
    @SwitchTo
    @FindBy(css="iframe")
    public WidgetComponent widget;

    public String getSourceCode(){
        return webDriver.getPageSource();
    }
}
