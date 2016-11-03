package com.nx.practice.reflection;

import com.nx.practice.reflection.annotations.Test;
import com.nx.practice.reflection.annotations.TesterInfo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * This Class example attempts to invoke a method of a private inner class
 *
 * @author mhachem on 11/2/2016.
 */
public class AnnotationReflection {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {

        //AnnotationReflection.TestInfoExample testInfoExample = new AnnotationReflection().new TestInfoExample();
        //testInfoExample.testA();

        System.out.println("testing...");

        Class<TestInfoExample> cls = TestInfoExample.class;

        if (cls.isAnnotationPresent(TesterInfo.class)) {

            Annotation annotation = cls.getAnnotation(TesterInfo.class);
            TesterInfo testerInfo = (TesterInfo) annotation;

            System.out.printf("author %s\n", testerInfo.createdBy());
            System.out.printf("last modified %s\n", testerInfo.lastModified());
            System.out.printf("priority %s\n", testerInfo.priority());

            System.out.println("TesterInfo tags: " + Arrays.toString(testerInfo.tags()));


            System.out.println("-----------------------------------------");

            Class<TestInfoExample> testClass = TestInfoExample.class;
            Method[] methods = testClass.getDeclaredMethods();
            for (Method m : methods) {
                Test mAnnotation = m.getAnnotation(Test.class);
                if (mAnnotation.enabled()) {
                    Class<AnnotationReflection> annotationReflectionClass = AnnotationReflection.class;
                    AnnotationReflection annotationReflectionInstance = annotationReflectionClass.newInstance();
                    // List all available constructors.
                    // We must use the method getDeclaredConstructors() instead
                    // of getConstructors() to get also private constructors.
                    for (Constructor<?> ctor : AnnotationReflection.TestInfoExample.class.getDeclaredConstructors()) {
                        System.out.println(ctor);
                        if(Modifier.isPrivate(ctor.getModifiers())) {
                            ctor.setAccessible(true);
                        }
                        AnnotationReflection.TestInfoExample instance = (TestInfoExample) ctor.newInstance(annotationReflectionInstance);
                        m.invoke(instance);
                    }
                } else {
                    System.out.println(m.getName() + " is test disabled");
                }
            }

        }

    }

    @TesterInfo(
            createdBy = "mahmoud",
            priority = TesterInfo.Priority.HIGH,
            tags = {"Java", "C++", "C#"}
    )
    private class TestInfoExample {

        public TestInfoExample() {

        }

        @Test(enabled = true)
        void testA() {
            System.out.println("Test A is running");
        }

        @Test
        void testB() {
            System.out.println("Test B is running");
        }

        @Test(enabled = true)
        void testC() {
            System.out.println("Test C is running");
        }

    }

}
