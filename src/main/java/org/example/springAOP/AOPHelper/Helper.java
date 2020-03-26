package org.example.springAOP.AOPHelper;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Terms:
 * Advice -> Before, After
 * PointCut -> where
 */

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {

    @Before("execution(public String getName())")
    public void log() {
        System.out.println("This is the log for get method called");
    }
}
