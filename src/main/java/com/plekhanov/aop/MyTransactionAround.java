package com.plekhanov.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


/**
 * аннотация Around нужна что бы написать много строчек код до и после вызова кого то метода ,
 * если нужно вызвать какой то метод до или после используем Before или After или AfterReturning
 */

@Aspect
@Component
public class MyTransactionAround {

    // пишем логику перед и после вызова какогото метода

    @Around("execution(* com.plekhanov.aop.MyRepoImpl.getInfo())")
    public void aroundTransaction(ProceedingJoinPoint joinPoint){

        try {
            System.out.println("begin transaction");
            // Выполняемый метод
            joinPoint.proceed();
            System.out.println("after transaction");
        } catch (Throwable e){
            System.out.println("rollback");
        } finally {
            System.out.println("commit transaction");
        }
    }
}
