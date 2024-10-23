package com.iskhak.customannotation;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MeasureExecutionTimerAspect {

    @Around("@annotation(MeasureExecutionTime)")
    public Object measureExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object r = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println(proceedingJoinPoint.getSignature() + " ------- ");
        return r;
    }

}
