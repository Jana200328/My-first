package com.example.java;

public class Assume extends Define {

    public void doOperation(){
        assignValue();
        int sum = intValue + intValue1;
        playMusic();
        System.out.println(sum);
    }

    public int getNumber() {
        int a = 1+2;
        return a;
    }

    public String getString() {
        String sample = "hello";
        return sample;
    }
}
