package com.dgmf.aop.annotationstyle.aspects;

import com.dgmf.aop.services.VehicleServices;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class LoggerAnnotationAspect {
    private Logger logger = Logger.getLogger(VehicleServices.class.getName());

    @Around("@annotation(com.dgmf.aop.annotationstyle.interfaces)")
    public void logWithAnnotation(ProceedingJoinPoint joinPoint)
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
}
