package org.example.dk.casproxyrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    @GetMapping("/data")
    public String someData() {
        return "Hello from REST API service";
    }
}
