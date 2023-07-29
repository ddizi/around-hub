package com.mj.around.hub.controller;

import com.mj.around.hub.controller.dto.MemberDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    // http://localhost:8080/api/v1/post-api/default
    @PostMapping("/default")
    public String postMethod() {
        return "hello world!";
    }

    // http://localhost:8080/api/v1/post-api/member
    @PostMapping("/member")
    public String postMember(@RequestBody Map<String,Object> postData) {
        StringBuilder sb = new StringBuilder();
        postData.entrySet().forEach(entry -> {
            sb.append(entry.getKey() + ":" + entry.getValue() + " " + "\n");
        });
        return sb.toString();
    }

    // http://localhost:8080/api/v1/post-api/member2
    @PostMapping("/member2")
    public String postMember2(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }
}
