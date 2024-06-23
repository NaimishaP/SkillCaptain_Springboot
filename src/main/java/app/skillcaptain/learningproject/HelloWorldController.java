package app.skillcaptain.learningproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my_first_api")
public class HelloWorldController {
@GetMapping
    public String myFirstAPIMethod(){
       return "Hello, skill captain";
    }
}
