package com.andersonszasilva.reactivespring;

public class CustomException extends Throwable {

    private String message;

    public CustomException(Throwable e) {
        this.message = e.getMessage();
    }

    @Override
    public String getMessage() {
        return message;
    }
}
