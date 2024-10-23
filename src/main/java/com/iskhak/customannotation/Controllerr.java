package com.iskhak.customannotation;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllerr {

    @GetMapping("/fast")
    @MeasureExecutionTime
    public String fastMethod(){
        return "fast";
    }

    @GetMapping("/slow")
    @MeasureExecutionTime
    public String slowMethod() throws InterruptedException {
        Thread.sleep(3000);
        return "slow";
    }


}
