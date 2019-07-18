package com.andrei.exercises.interfaces;

import java.util.Scanner;

public class DemoCont {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduceti numele: ");
        String name = input.nextLine();

        System.out.println("Soldul precedent este de: ");
        int sold = input.nextInt();

        System.out.println("Introduceti salariul lunar in lei: ");
        int salariu = input.nextInt();

        System.out.println("Introduceti suma facturilor lunare in lei: ");
        int facturi = input.nextInt();

        Cont cont = new Cont(name,sold,salariu,facturi);
        System.out.println("Sold dupa primirea salariului: "+cont.primesteSalariu()+" lei");
        System.out.println("Sold final dupa platirea facturilor: "+cont.platesteFacturi()+" lei");
        cont.print();

    }


}
