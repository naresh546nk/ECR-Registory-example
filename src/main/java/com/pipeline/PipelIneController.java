package com.pipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PipelIneController {

    @GetMapping("/")
    public String getMessage(){
        return  "You are successfully created the pipeline . Application is running fine ! ";
    }
}
