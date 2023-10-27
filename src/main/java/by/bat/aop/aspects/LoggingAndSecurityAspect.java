package by.bat.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* by.bat.aop.UniLibrary.get*())")
    private void allGetMethodsFromUniLib(){
    }

    @Pointcut("execution(* by.bat.aop.UniLibrary.return*())")
    private void allReturnMethodsFromUniLib(){
    }

    @Pointcut("allReturnMethodsFromUniLib() || allGetMethodsFromUniLib()")
    private void allGetAndReturnMethodsFromUniLib(){}


    @Before("allGetMethodsFromUniLib()")
    public void beforeGetLoggingAdvice(){
        System.out.println("writing log 1");
    }

    @Before("allReturnMethodsFromUniLib()")
    public void beforeReturnLoggingAdvice(){
        System.out.println("writing log 2(return)");
    }

    @Before("allGetAndReturnMethodsFromUniLib()")
    public void beforeGetAndReturnLoggingAdvice(){
        System.out.println("writing log 3(or)");
    }
/*    @Pointcut("execution(* get*())")
    private void allGetMethods(){}

    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("try to get book/magazine");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("check rule to take some book");
    }*/
}
