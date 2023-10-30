package by.bat.aop.aspects;

import by.bat.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
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


    @Before("by.bat.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature " + methodSignature);
        System.out.println("methodSignature.getMethod " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Info about Book: name -  " + myBook.getName() + ", author - " + myBook.getAuthor() +
                            ", year of published - " + myBook.getYearOfPublication());
                }
                else if (obj instanceof String){
                    System.out.println("who added this book to Lib " + obj);
                }
            }
        }

        System.out.println("logging + try to add book/magazine");
        System.out.println("-----------------");
    }


}
