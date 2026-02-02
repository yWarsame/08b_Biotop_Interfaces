package com.cc.java;

import com.cc.java.bees.*; // all bees importieren
import com.cc.java.birds.Bird;

public class App {
    
    public static void main(String[] args) {

        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();   

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);

        Bird bird = new Bird();
        pollObj(bird);
     
    }

    private static void pollObj(HoneyBee obj){
        output(obj.doYourJob());
        output(obj.fly());
        output("-------------------");
    }

    // überadene Methode
    private static void pollObj(Bird obj){
        output(obj.hasFeathers());
        output(obj.fly());
        output("-------------------");
    }


    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}


