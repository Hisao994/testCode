package com.test;

public class PowerOfTwo {
    public static void main(String[] args) {
        //给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
        //
        //如果存在一个整数 x 使得 n == 2x ，则认为 n 是 2 的幂次方。
            System.out.println(isPowerOfTwo(3));
            System.out.println( 8&(7-1));
    }

    private static boolean isPowerOfTwo(int n){
        if(n==0){
            return true;
        }
        if (n==1){
            return true;
        }
        if (n>0){
            return (n&(n-1)) == 0;
        }
        return false;
    }
}

