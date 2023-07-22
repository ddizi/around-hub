package com.mj.around.hub.controller;

import com.mj.around.hub.controller.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v1/get-api")
public class GetController {

    // http://localhost:8080/api/v1/get-api/hello
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String getHello() {
        return "Hello World!";
    }

    // http://localhost:8080/api/v1/get-api/name
    @GetMapping("name")
    public String getName() {
        return "Michael";
    }

    // http://localhost:8080/api/v1/get-api/variable1/variable
    @GetMapping("variable1/{variable}")
    public String getVariable1(@PathVariable String variable) {
        return variable;
    }

    // http://localhost:8080/api/v1/get-api/variable2/variable
    @GetMapping("variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var) {
        return var;
    }

    // http://localhost:8080/api/v1/get-api/request1?name=Michael&email=michael@gmail.com&organization=AroundHub
    @GetMapping("request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization
    ) {
        return name + "\n" + email + "\n" + organization;
    }

    // http://localhost:8080/api/v1/get-api/request2?name=Michael&email=michael%40gmail.com&organization=AroundHub
    @GetMapping("request2")
    public String getRequestParam2(@RequestParam Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        params.entrySet().forEach(entry -> {
            sb.append(entry.getKey() + ":" + entry.getValue() + " " + "\n");
        });
        return sb.toString();
    }

    // http://localhost:8080/api/v1/get-api/request3?name=Michael&email=michael%40gmail.com&organization=AroundHub
    @GetMapping("request3")
    public String getRequestParam3(MemberDto memberDto) {
        return memberDto.toString();
    }
}
