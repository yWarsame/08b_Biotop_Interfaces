package com.cc.java;

public class Bird extends HoneyBee{

    @Override
    public String doYourJob() {
        return "But I'm a Biiiiiird!"; // erzwungenes Bienenverhalten
    }

    @Override
    public String fly() {
        return "I fly at 20mp!";
    }

}
