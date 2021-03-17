package com.designpatterns.dp;

public class Main {

    public static void main(String[] args){
        HayesModem hayesModem = new HayesModem();
        FileMover fileMover = new FileMover(hayesModem);
        System.out.println("\n------------------------------");
        System.out.println(fileMover.dialAndReceive() + fileMover.sendAndHangUp());

        DedModemAdapter dedModemAdapter = new DedModemAdapter();
        fileMover = new FileMover(dedModemAdapter);
        System.out.println("\n------------------------------");
        System.out.println(fileMover.dialAndReceive() + fileMover.sendAndHangUp());
    }
}
