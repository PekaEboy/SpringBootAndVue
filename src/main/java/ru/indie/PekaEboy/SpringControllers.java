package ru.indie.PekaEboy;
import org.springframework.web.bind.annotation.*;

@RestController
public class SpringControllers {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello World!";
    }
}
