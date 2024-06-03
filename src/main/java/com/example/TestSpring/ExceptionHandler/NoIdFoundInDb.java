package com.example.TestSpring.ExceptionHandler;

import lombok.Data;

@Data
public class NoIdFoundInDb extends RuntimeException{

    private final String idNotPresent;
    private final Long id;

    public NoIdFoundInDb(String idNotPresent, Long id) {
        super();
        this.idNotPresent=idNotPresent;
        this.id=id;
    }




}
