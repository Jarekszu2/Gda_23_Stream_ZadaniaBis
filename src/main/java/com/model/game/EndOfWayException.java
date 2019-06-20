package com.model.game;

public class EndOfWayException extends Exception {
    public EndOfWayException() {
        super("End of way. Change direction!");
    }
}
