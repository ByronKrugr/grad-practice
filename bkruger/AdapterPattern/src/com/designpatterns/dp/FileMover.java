package com.designpatterns.dp;

public class FileMover {
    private Modem modem;

    public FileMover(Modem modem){
        this.modem = modem;
    }

    public String dialAndReceive(){
        return modem.dial() + modem.receive();
    }

    public String sendAndHangUp(){
        return modem.send() + modem.hangUp();
    }

}
