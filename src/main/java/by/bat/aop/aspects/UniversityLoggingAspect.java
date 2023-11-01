package by.bat.aop.aspects;


import by.bat.aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

/*    @Before("execution(* getStudents())")
    public void beforeGetStudentsAdvice(){
        System.out.println("beforeGetStudentsAdvice: logging before method get Students");
    }*/

/*    @AfterReturning(pointcut = "execution(* getStudents())", returning = "ger")
    public void afterGetStudentsAdvice(List<Student> ger){

        Student firstStudent = ger.get(0);

        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        double avgGrade = firstStudent.getAvgGrade();
        avgGrade = avgGrade + 1;
        firstStudent.setAvgGrade(avgGrade);

        System.out.println("afterGetStudentsAdvice: logging after method get Students");
    }*/

/*    @AfterThrowing (pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterThrowingGetStudentsAdvice(Throwable exception){
        System.out.println("afterThrowingGetStudentsAdvice: logging exit throwing " + exception);
    }*/

    @After("execution (* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: logging normal ending or exception");
    }
}
