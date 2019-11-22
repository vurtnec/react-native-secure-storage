package com.aaxis.rnsecurestorage.exceptions;

/**
 * Created by zacharyhou on 2019/11/22.
 */

public class CryptoFailedException extends Exception {

    public CryptoFailedException(String message) {
        super(message);
    }

    public CryptoFailedException(String message, Throwable t) {
        super(message, t);
    }
}
