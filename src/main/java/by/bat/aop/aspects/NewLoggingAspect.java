package by.bat.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution (public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint point) throws Throwable{
        System.out.println("aroundReturnBookLoggingAdvice: in lib trying return the book");
        long begin = System.currentTimeMillis();
        Object targetMethodResult = point.proceed();
       // targetMethodResult = "Dracul";
        long end = System.currentTimeMillis();
        long time = end-begin;
        System.out.println("aroundReturnBookLoggingAdvice: in lib return the book sucses");
        System.out.println("roundReturnBookLoggingAdvice: method do work by time - " + time + " ms");
        return targetMethodResult;
    }
}
