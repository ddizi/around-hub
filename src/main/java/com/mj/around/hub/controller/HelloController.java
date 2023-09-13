package com.mj.around.hub.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping("log-test")
    public void logTest() {
        log.trace("log trace");
        log.debug("log debug");
        log.info("log info");
        log.warn("log warn");
        log.error("log error");
    }

    @PostMapping("exception")
    public void exception() throws Exception{
        throw new Exception("exception test");
    }

//    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String,String>> exceptionHandler(Exception e) {
        HttpHeaders headers = new HttpHeaders();
        HttpStatus status = HttpStatus.BAD_REQUEST;
        log.info(e.getLocalizedMessage());
        log.info("Controller 내 exception handler 호출");
        Map<String,String> body = new HashMap<>();
        body.put("error type", status.getReasonPhrase());
        body.put("code", "400");
        body.put("message", "에러발생");

        return new ResponseEntity<>(body, headers, status);
    }
}
