package com.mj.around.hub.controller;

import com.mj.around.hub.dto.MemberDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/v1/put-api")
public class PutController {

    // http://localhost:8080/api/v1/put-api/default
    @PutMapping("default")
    public String putMethod() {
        return "Hello World!";
    }

    // http://localhost:8080/api/v1/put-api/member
    @PutMapping("member")
    public String postMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(entry -> {
            sb.append(entry.getKey() + ":" + entry.getValue() + " " + "\n");
        });
        return sb.toString();
    }

    // http://localhost:8080/api/v1/put-api/member1
    @PutMapping("member1")
    public String postMember2(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

    // http://localhost:8080/api/v1/put-api/member2
    @PutMapping("member2")
    public MemberDto postMember3(@RequestBody MemberDto memberDto) {
        return memberDto;
    }

    // http://localhost:8080/api/v1/put-api/member3
    @PutMapping("member3")
    public ResponseEntity<MemberDto> postMember4(@RequestBody MemberDto memberDto) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDto);
    }

    // http://localhost:8080/api/v1/put-api/member4
    @PutMapping("member4")
    public ResponseEntity<MemberDto> postMember5(@RequestBody MemberDto memberDto) {
        return ResponseEntity.ok(memberDto);
    }
}
