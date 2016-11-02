package com.nx.practice;

/**
 * @author mhachem on 11/1/2016.
 */
public class ReferenceChange {

    public static void main(String[] args) {

        Com c = new Com();
        c.c = 1;

        System.out.println(c.c);

        increment(c);

        System.out.println(c.c);
    }

    public static void increment(Com com) {
        com.c += 1;
    }

    static class Com {
        int c = 1;
    }

}
