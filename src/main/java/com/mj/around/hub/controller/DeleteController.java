package com.mj.around.hub.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DeleteController {

    @DeleteMapping("/delete/{variable}")
    public String deleteVariable(@PathVariable String variable) {
        return variable;
    }
}
