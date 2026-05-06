package com.banc.core;

// TODO 6.2: Aquesta excepció ha de llançar-se quan la longitud no sigui de 24 caràcters.
public class LongitudInvalidaException extends BancException {
    public LongitudInvalidaException(String message) {
        super(message);
    }
}
