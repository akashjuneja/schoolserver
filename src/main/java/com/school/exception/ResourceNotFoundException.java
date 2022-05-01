package com.school.exception;

public class ResourceNotFoundException extends RuntimeException{
    //It Implements Serializable Interface

    private static final long serialVersionUID=1L;

    public ResourceNotFoundException(String message){
        super(message);
    }
}
