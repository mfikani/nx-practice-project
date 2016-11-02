package com.nx.practice;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * <b>getDeclaredFields()</b> return set of fields irrespective of their visibility
 * <br />
 * <b>getFields()</b> returns  set of public fields declared and inherited by the class
 *
 *
 * @author mhachem on 11/1/2016.
 */
public class App {

    public static void main(String[] args) {

        PrincipalCashFlow principalCashFlow = new PrincipalCashFlow();
        principalCashFlow.setAddedValue(1000);

        Class cls = principalCashFlow.getClass();
        List<Field> acm = new LinkedList<Field>();
        while(cls != null) {
            Field[] fields = cls.getDeclaredFields();
            acm.addAll(Arrays.asList(fields));
            cls = cls.getSuperclass();
        }
        System.out.println(Arrays.toString(acm.toArray()));
    }

}
