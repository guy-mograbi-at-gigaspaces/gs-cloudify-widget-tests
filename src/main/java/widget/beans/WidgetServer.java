package widget.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: guym
 * Date: 8/22/13
 * Time: 12:28 AM
 */
@Component
public class WidgetServer {
    public String host = "http://localhost:9000";

    public void setHost(String host) {
        this.host = host;
    }
}
