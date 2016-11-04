package com.nx.practice.reflection;

import com.nx.practice.reflection.annotations.Executable;
import com.nx.practice.reflection.annotations.ExecutableRun;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Used {@link Reflections} from <a href="https://github.com/ronmamo/reflections">org.reflections</a> library
 *
 * @author mhachem on 11/2/2016.
 */
public class AppExecutor {

    private static final ExecutorService sExecutorService = Executors.newSingleThreadExecutor();

    public static void main(String[] args) {


        Reflections reflections = new Reflections("com.nx.practice.reflection");

        sExecutorService.execute(() -> {
            Set<Class<?>> executableSet = reflections.getTypesAnnotatedWith(Executable.class);
            executableSet.forEach(aClass -> {
                Executable annotation = aClass.getDeclaredAnnotation(Executable.class);
                if(annotation.enabled()) {
                    try {
                        Method[] ms = aClass.getDeclaredMethods();
                        for (Method m : ms) {
                            if(m.isAnnotationPresent(ExecutableRun.class)) {
                                try {
                                    m.invoke(aClass.newInstance());
                                } catch (InvocationTargetException e) {
                                    e.printStackTrace();
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    }
                }
            });
        });

        sExecutorService.shutdown();
    }

}
