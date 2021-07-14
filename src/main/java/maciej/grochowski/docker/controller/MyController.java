package maciej.grochowski.docker.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Value("${envName}")
    private String envName;

    @GetMapping("/hello")
    public String hello() {
        return "heyeyeyeyeyey " + envName;
    }
}
