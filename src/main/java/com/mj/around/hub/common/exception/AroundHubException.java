package com.mj.around.hub.common.exception;

import com.mj.around.hub.common.Constatnts;
import org.springframework.http.HttpStatus;

public class AroundHubException extends Exception{

    private static final long serialVersionUID = 4663380430591151694L;

    private final Constatnts.ExceptionClass exceptionClass;
    private final HttpStatus httpStatus;

    public AroundHubException(Constatnts.ExceptionClass exceptionClass, HttpStatus httpStatus, String message) {
        super(exceptionClass.toString() + " : " + message);
        this.exceptionClass = exceptionClass;
        this.httpStatus = httpStatus;
    }

    public Constatnts.ExceptionClass getExceptionClass() {
        return exceptionClass;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getHttpStatusType() {
        return httpStatus.getReasonPhrase();
    }

    public int getHttpStatusValue() {
        return httpStatus.value();
    }
}
