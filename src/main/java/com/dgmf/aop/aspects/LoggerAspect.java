package com.dgmf.aop.aspects;

import com.dgmf.aop.services.VehicleServices;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class LoggerAspect {
    private Logger logger = Logger.getLogger(VehicleServices.class.getName());

    @Around("execution(* com.dgmf.aop.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint)
            throws Throwable {
        logger.info(joinPoint.getSignature().toString() +
                " method execution start");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : "+timeElapsed);
        logger.info(joinPoint.getSignature().toString() +
                " method execution end");
    }

    // In Case of Exception
    @AfterThrowing(
            value = "execution(* com.dgmf.aop.services.*.*(..))",
            throwing = "exception"
    )
    public void logException(JoinPoint joinPoint, Exception exception) {
        logger.log(Level.SEVERE, joinPoint.getSignature() +
                " An Exception Thrown with the Help of @AfterThrowing witch " +
                "Happened Due to : " + exception.getMessage());
    }

    // If Successful
    @AfterReturning(
            value = "execution(* com.dgmf.aop.services.*.*(..))",
            returning = "returnedValue"
    )
    public void logStatus(JoinPoint joinPoint, Object returnedValue) {
        logger.log(Level.INFO, joinPoint.getSignature() +
                " Method Successfully Processed with the Status " +
                returnedValue.toString());
    }
}
