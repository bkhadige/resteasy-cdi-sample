package sample.message.util;

import javax.ejb.Stateless;

@Stateless
public class MessageFormat {

    public String format(String message) {
        return "Message is : ".concat(message);
    }

}
