package com.example.test.Test_Spring_Boot.tdo.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class Response {
    private HttpStatus code;
    private String message;
    private Object resultInfo;
}
