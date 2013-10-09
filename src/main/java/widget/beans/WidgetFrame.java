package widget.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created with IntelliJ IDEA.
 * User: guym
 * Date: 10/8/13
 * Time: 11:35 PM
 */
public class WidgetFrame {
    @FindBy( css = "#start_btn")
    WebElement start;
}
