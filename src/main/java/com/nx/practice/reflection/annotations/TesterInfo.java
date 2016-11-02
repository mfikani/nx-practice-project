package com.nx.practice.reflection.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;

/**
 * @author mhachem on 11/2/2016.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TesterInfo {

    public enum Priority {
        HIGH(1), MODERATE(2), LOW(3);

        int me;

        Priority(int i) {
            this.me = i;
        }

        @Override
        public String toString() {
            return String.format(Locale.getDefault(), "%s", String.valueOf(me));
        }
    }

    public Priority priority() default Priority.MODERATE;

    String[] tags() default "";

    String createdBy() default "mhachem";

    String lastModified() default "03/02/2016";

}
