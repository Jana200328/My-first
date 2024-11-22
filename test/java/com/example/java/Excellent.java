package com.example.java;

import java.util.ArrayList;

public class Excellent {

    Over over = new Over();


    public void dont(int c) {
        while (c > 50) {
            System.out.println("excellent");
        }
    }

    public void dog(int a) {
        switch (a) {
            case 1:
                System.out.println("vivo");
                break;
            case 2:
                System.out.println("realme");
                break;
            case 3:
                System.out.println("redmi");
                break;
            default:
                System.out.println("iqoo");
        }
    }

    //public void add(int a , int b){

    // public void add(int a , int b , int c){
    // over.hello(a, b, c);
    //over.sample();

    public void loop(int b) {
        for (b = 1; b < 10; b--) {
            System.out.println(b);
        }
    }

    public void nested(int a, int b) {
        for (a = 2; a < 3; a++) {

            for (b = 2; b < 5; b++) {
                System.out.println(b);
            }
        }
    }

    public void matrix(int a, int b) {
        String n = "*";
        for (a = 1; a <= 5; a++) {
            for (b = 1; b <= 3; b++) {
                System.out.print(n + "\t");
            }
            System.out.println(" ");
        }
    }

    public void loop(int c, int a) {
        for (c = 8; c > 1; c--) {
            System.out.println(c);
        }
    }

    public void star(int a, int b) {
        String n = "*";
        for (a = 5 ;a >= 1; a--) {
            for (b = 1; b <=a; b++) {
                System.out.print(n);

            }
            System.out.println("  ");
        }
    }

    public void odd(int a){
        for(a=1; a<=10; a++){
            if(a%2==0){
                System.out.println(a+ "is even");
            }else {
                System.out.println(a + "is odd");
            }
        }
    }

    public void tables(int a , int b){
        for(a=1; a<=10; a++){
            for(b=2; b<=10; b++){
                int c=a*b;
                System.out.println(a+"*"+b+"="+c);
            }
        }
    }

    public void root(int a){
        int i=10;
        int c = 1;
        while(i>=1){
            c=i*a;
            System.out.println(a+"*"+i+"="+c);
            i--;
        }
    }

    public void sign(int a){
        int c=1;
        int b=1;
        for(a=10; a>=1;  ) {
            c=a*b;
            System.out.println(a+"*"+b+"="+c);
            a--;
        }
    }

    public void integer() {
        int[] myArray;
        myArray = new int[] {1, 2, 3, 4, 6, 8, 9, 5} ;
        for (int a= 0; a<= 7; a++) {
            System.out.println(myArray[a]);

        }
            int[] sampleArray = new int[3];
            sampleArray[0] = 1;
            sampleArray[1] = 300;
            sampleArray[2] = 985;

            System.out.println(sampleArray[1]);


    }

    public void integers(int a){
        int [] myArray;
        myArray = new int[a];

        for (int i=0; i<a; i++) {
            myArray[i] = i;
            System.out.println(myArray[i] + " = " + i );
        }
    }

    public void integer (int a){
        int[] myArray = new int [a];
        for(int i=0; i<a; i++){
            myArray[i] = i;
            System.out.println(myArray[i] + "=" + i);
        }
    }

    public void array(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(a.get(2));

        ArrayList<String> b = new ArrayList<String>();
        b.add("apple");
        b.add("mango");
        System.out.println(b.get(0));
    }

    public void arrow(){
        ArrayList<Integer> Myarray = new ArrayList<Integer>();
        Myarray.add(1);
        Myarray.add(2);
        System.out.println(0);
    }

    public void arrows(){
        ArrayList<String> MyArray = new ArrayList<String>();
        MyArray.add("guava");
        System.out.println(0);
    }

}




 //System.out.print("**\n");
              // System.out.print("***\n");
               //System.out.print("****\n");
               //System.out.print("*****\n");