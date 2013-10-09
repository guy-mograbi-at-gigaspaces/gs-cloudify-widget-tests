package widget.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webui.tests.components.abstracts.AbstractComponent;

/**
 * Created with IntelliJ IDEA.
 * User: guym
 * Date: 8/22/13
 * Time: 12:48 AM
 */
public class WidgetComponent extends AbstractComponent<WidgetComponent>{

    @FindBy( css = "#start_btn" )
    public WebElement play;

    @FindBy( css = "#stop_btn")
    public WebElement stop;

    @FindBy( css = "#cloudify_dashboard_link" )
    public WebElement managementLink;

    @FindBy( css = "#custom_link a")
    public WebElement customLink;

    public void start(){
        play.click();
    }

    public String getSourceCode(){
        return webDriver.getPageSource();
    }

}
