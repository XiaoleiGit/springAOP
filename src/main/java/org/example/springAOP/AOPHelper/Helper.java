package org.example.springAOP.AOPHelper;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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

    @Before("allGetters()")
    public void logGetName() {
        System.out.println("This is the log for getName method called");
    }

    @Before("allGetters()")
    public void secondAdvice() {
        System.out.println("This is the second advice");
    }

    @Before("allModelMethods()")
    public void thirdAdvice() {
        System.out.println("This is the 3rd advice");
    }

    @Pointcut("execution(public * getName())")
    public void allGetters(){}

//    @Pointcut("within(org.example.springAOP.model.*)") means apply to model package
//    @Pointcut("within(org.example.springAOP.model..*)") means apply to model and underneath package
    @Pointcut("within(org.example.springAOP.model.*)")
    public void allModelMethods(){}

}
