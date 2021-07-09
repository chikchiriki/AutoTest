package TestSoap;

import javax.jws.WebService;
import javax.jws.WebMethod;

public class HelloWorldImpl implements HelloWorld {
    @Override
    public String greetings(String text) {
        return "Hi " + text;
    }
}
