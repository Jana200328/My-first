package com.example.java;

public class Value {

    public void game(int a) {
        if (a > 0 || a < 100) {
            if (a < 10) {
                System.out.println("poor");
            } else if (a > 10) {
                System.out.println("avg");
            } else if (a > 50) {
                System.out.println("good");
            } else if (a > 80) {
                System.out.println("excellent");
            }

        System.out.println("error");
    }}



   public void gandhi(String anyname){
        switch (anyname){
            case "cricket":
                System.out.println("classroom");
                break;
            case "bat":
                System.out.println("duster");
                break;
            default :
                System.out.println("chalk");
        }
   }
}

