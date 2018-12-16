package com.plekhanov.aop;


import org.aspectj.lang.annotation.*;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;


/**
 * если нужно вызвать метод до или после какого метода используем Before или After или AfterReturning
 */


// порядок выполнения - implements Ordered  иил ставим @Order(0)

@Aspect
@Component
public class MyTransactionAspect  implements Ordered {

    // поинткат с параметрами
    @Pointcut("execution(* com.plekhanov.aop.MyUserInfo.withParam(String)) && args(name)")
    public void beforeWithParam(String name){

    }
    // Привязываем аспект к методу с параметрами
    @Before("beforeWithParam(name)")
    public void withParamPointCut(String name){
        System.out.println("before method withParam , name = " + name );
    }


    /**
     * перед методом ставим поинткат привязывая аспект к методу
     * @Before("execution(* com.plekhanov.aop.MyUserInfo.getInfo())")
     *
     * или ссылку на вынесенный поинткат
     * @Before("myPointCut()")
     */

    //Вынесли поинткат в как одельный метод
    @Pointcut("execution(* com.plekhanov.aop.MyUserInfo.getInfo())")
    public void myPointCut(){

    }

    //  @Before("execution(* com.plekhanov.aop.MyUserInfo.getInfo())")
    // @Before("myPointCut()")
    public void beginTransaction(){
        System.out.println("begin transaction -");
    }



    //  @AfterReturning("execution(* com.plekhanov.aop.MyUserInfo.getInfo())")
    //  @AfterReturning("myPointCut()")
    public void commitTransaction(){
         System.out.println("commit transaction -");
    }


    //  @After("execution(* com.plekhanov.aop.MyUserInfo.getInfo())")
    //  @After("myPointCut()")
    public void after(){
        System.out.println("after transaction -");
    }



    //  @AfterThrowing("execution(* com.plekhanov.aop.MyUserInfo.getInfo())")
    //  @AfterThrowing("myPointCut()")
    public void rollback(){
        System.out.println("rollback transaction -");
    }



    public int getOrder() {
        return 0;
    }
}
