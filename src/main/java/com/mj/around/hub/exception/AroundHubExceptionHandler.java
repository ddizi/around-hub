package com.mj.around.hub.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
@Slf4j
public class AroundHubExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String,String>> exceptionHandler(Exception e) {
        HttpHeaders headers = new HttpHeaders();
        HttpStatus status = HttpStatus.BAD_REQUEST;
        log.info(e.getMessage());
        log.info("Advice 내 exception handler 호출");
        Map<String,String> body = new HashMap<>();
        body.put("error type", status.getReasonPhrase());
        body.put("code", "400");
        body.put("message", "에러발생");

        return new ResponseEntity<>(body, headers, status);
    }

}
