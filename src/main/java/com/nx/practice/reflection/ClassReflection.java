package com.nx.practice.reflection;

import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * @author mhachem on 11/1/2016.
 */
public class ClassReflection {

    public static void main(String[] args) throws ClassNotFoundException {

        Class c = Class.forName("com.nx.practice.Loan");

        System.out.println("simple name: " + c.getSimpleName());
        System.out.println("full qualified name: " + c.getName());
        System.out.println("canonical name: " + c.getCanonicalName());
        System.out.println("modifiers: isPrivate() "+ Modifier.isPrivate(c.getModifiers()));
        System.out.println(Arrays.toString(c.getClasses()));

        System.out.println("-----------------------------------------");

        System.out.println("interfaces: " + Arrays.toString(c.getInterfaces()));

    }

}
