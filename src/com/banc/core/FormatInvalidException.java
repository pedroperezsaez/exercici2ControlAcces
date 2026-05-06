package com.banc.core;

// TODO 6.3: Aquesta excepció ha de llançar-se quan l'ID no comenci per "ES" o contingui caràcters no numèrics on no toca.
public class FormatInvalidException extends BancException {
    public FormatInvalidException(String message) {
        super(message);
    }
}
