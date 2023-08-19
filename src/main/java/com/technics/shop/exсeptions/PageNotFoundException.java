package com.technics.shop.exсeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class PageNotFoundException extends RuntimeException{

    public PageNotFoundException(String path) {
        System.out.printf("This %s page not exist", path);
    }
}
