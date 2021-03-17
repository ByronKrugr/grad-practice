package com.designpatterns.dp;

public class DedModemAdapter implements Modem {

    private DedModem dedModem;

    public DedModemAdapter(){
        dedModem = new DedModem();
    }

    @Override
    public String dial() {
        return "";
    }

    @Override
    public String hangUp() {
        return "";
    }

    @Override
    public String send() {
        return dedModem.send();
    }

    @Override
    public String receive() {
        return dedModem.receive();
    }
}
