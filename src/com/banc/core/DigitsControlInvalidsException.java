package com.banc.core;

// TODO 6.4: Aquesta excepció ha de llançar-se quan l'algorisme de càlcul de DC no coincideixi.
public class DigitsControlInvalidsException extends BancException {
    public DigitsControlInvalidsException(String message) {
        super(message);
    }
}
