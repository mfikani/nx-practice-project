package com.nx.practice.reflection;

import com.nx.practice.reflection.annotations.Executable;
import com.nx.practice.reflection.annotations.ExecutableRun;

/**
 * @author mhachem on 11/2/2016.
 */
@Executable(enabled = true)
public class FieldsReflection {


    @ExecutableRun(enabled = true)
    public void doRun() {
        System.out.println("Yay reflection is expressive!");
    }

    @ExecutableRun(enabled = true)
    public void doRun2() {
        System.out.println("Will this run?");
    }


}
