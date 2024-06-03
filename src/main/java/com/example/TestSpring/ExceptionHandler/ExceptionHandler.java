package com.example.TestSpring.ExceptionHandler;

import com.example.TestSpring.model.ExceptionModel;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler
    ResponseEntity<Object> toHandleException(NoIdFoundInDb noIdFo){

        String noId=noIdFo.getIdNotPresent();
        Long id=noIdFo.getId();
        ExceptionModel responseBody=createResponsbody(noId,id);


        return new ResponseEntity<>(responseBody, HttpStatus.NOT_FOUND);



    }

    private ExceptionModel createResponsbody(String noId, Long id) {

        return ExceptionModel.builder()
                .noId(noId)
                        .id(id)

        .build();
    }
}
