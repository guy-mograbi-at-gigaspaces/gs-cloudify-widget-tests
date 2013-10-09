package widget.beans;

import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import webui.tests.annotations.NoEnhancement;
import webui.tests.annotations.SwitchTo;
import webui.tests.components.abstracts.AbstractComponent;

/**
 * Created with IntelliJ IDEA.
 * User: guym
 * Date: 10/8/13
 * Time: 11:31 PM
 */
@Component
public class DemoPageWrapper extends AbstractComponent<DemoPageWrapper> {

    @SwitchTo
    @FindBy(css="iframe")
    public DemoPage demoPage;

    public String path = "/d";

    @Autowired
    WidgetServer server;

    @NoEnhancement
    public DemoPageWrapper goTo(){
        webDriver.get( server.host + path );
        return this;
    }

    public void setServer(WidgetServer server) {
        this.server = server;
    }
}
