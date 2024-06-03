package com.example.TestSpring.ExceptionHandler;

import org.springframework.http.HttpStatus;

public class NoIdFoundInDbParametes {
    private  Long id;
    private   String idNotPresent;
    private  String message;
    private Throwable throwable;
    private HttpStatus httpStatus;

    public NoIdFoundInDbParametes() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdNotPresent() {
        return idNotPresent;
    }

    public void setIdNotPresent(String idNotPresent) {
        this.idNotPresent = idNotPresent;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public NoIdFoundInDbParametes(Long id, String idNotPresent, String message, Throwable throwable, HttpStatus httpStatus) {
        this.id = id;
        this.idNotPresent = idNotPresent;
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }


}
