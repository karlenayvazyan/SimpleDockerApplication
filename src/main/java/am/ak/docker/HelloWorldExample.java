package am.ak.docker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by karlen on 4/20/17.
 */
@RestController
public class HelloWorldExample {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello from docker container";
    }
}
