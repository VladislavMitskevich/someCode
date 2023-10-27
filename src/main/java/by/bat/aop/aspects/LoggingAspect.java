package by.bat.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {



/*    @Pointcut("execution(* by.bat.aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary() {
    }

    @Pointcut("execution(public void by.bat.aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary() {
    }

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary() {
    }

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice(){
        System.out.println("log4(except returnMagazine)");
    }
    @Pointcut("execution(* by.bat.aop.UniLibrary.get*())")
    private void allGetMethodsFromUniLib(){
    }

    @Pointcut("execution(* by.bat.aop.UniLibrary.return*())")
    private void allReturnMethodsFromUniLib(){
    }

    @Pointcut("allReturnMethodsFromUniLib() || allGetMethodsFromUniLib()")
    private void allGetAndReturnMethodsFromUniLib(){}


    @Before("allGetMethodsFromUniLib()")
    public void beforeAllGetLoggingAdvice(){
        System.out.println("writing log 1");
    }

    @Before("allReturnMethodsFromUniLib()")
    public void beforeReturnLoggingAdvice(){
        System.out.println("writing log 2(return)");
    }

    @Before("allGetAndReturnMethodsFromUniLib()")
    public void beforeGetAndReturnLoggingAdvice(){
        System.out.println("writing log 3(or)");
    }*/


    @Before("by.bat.aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("try to get book/magazine");
    }


}
