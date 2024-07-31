package com.prismworks.prism.domain.index;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
public class IndexController {

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public String index() {
        return "hello world!";
    }

    @Hidden
    @GetMapping(value = "/healthcheck")
    public String healthcheck() {
        return "healthy";
    }
}
