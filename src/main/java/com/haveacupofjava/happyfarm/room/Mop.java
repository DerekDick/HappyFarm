package com.haveacupofjava.happyfarm.room;

public class Mop implements Cleanable {
    @Override
    public void clean() {
        System.out.println("mop the room");
    }
}
