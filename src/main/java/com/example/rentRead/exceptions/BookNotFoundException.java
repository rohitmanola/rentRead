package com.crio.rentRead.exceptions;

import java.io.IOException;

public class BookNotFoundException extends IOException {

    public BookNotFoundException(String message) {
        super(message);
    }
    
}