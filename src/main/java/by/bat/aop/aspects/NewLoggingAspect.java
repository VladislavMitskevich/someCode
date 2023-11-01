package by.bat.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution (public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint point) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: in lib trying return the book");

        Object targetMethodResult = null;
        try {
            targetMethodResult = point.proceed();
        } catch (Exception e){
            System.out.println("aroundReturnBookLoggingAdvice: we catch exception - " + e);
            throw e;
        }
            System.out.println("aroundReturnBookLoggingAdvice: in lib return the book sucses");
            return targetMethodResult;
        }
    }
