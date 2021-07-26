package com.test;

public class Test {
    public void change(String a ,char[] b){
        a = "good";
        b[0] = 'd';
    }

    public static void main(String[] args) {
        String a = new String("ok");
        char[] b = {'a','b','c'};
        Test t = new Test();
        t.change(a,b);
        System.out.print(a+" "+b[0]);
    }
}
