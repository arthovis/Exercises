package com.andrei.exercises.exceptions;

public class DemoExceptionWithTryCatchFinally {
    public static void main(String[] args) {
        exceptionTryCatchFinnaly();
    }

    private static void exceptionTryCatchFinnaly() {
        try{
            int x= 5/0;
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Nu mai imparti la 0!!!");
        }
    }

}
