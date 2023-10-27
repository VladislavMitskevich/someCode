package by.bat.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void get*())")
    public void beforeGetBookAdvice(){
        System.out.println("try to get book");
    }

    @Before("execution(public * returnBook())")
    public void beforeReturnBookAdvice(){
        System.out.println("try to return book");
    }
}
