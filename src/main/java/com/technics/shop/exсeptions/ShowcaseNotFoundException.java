package com.technics.shop.exсeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ShowcaseNotFoundException extends RuntimeException{

    public ShowcaseNotFoundException(String showcase) {
        System.out.printf("This %s not found", showcase);
    }
}
